<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common.jsp" %>
<!DOCTYPE html >
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="<%=basePath%>assets/css/layui.css">
    <link rel="stylesheet" href="<%=basePath%>assets/css/view.css"/>
   
    <link rel="icon" href="/favicon.ico">
    <style>
      .spacil {
    display: inline-block;
    margin-right:2px;
    width: 90%;
   
}
    </style>
    <title>管理后台</title>
</head>
<body class="layui-view-body">
     <div class="layui-content" id="box" style="display:none">
        <form class="layui-form" action="" lay-filter="formTest"  id="addGoodsForm">
          
          
           <div class="layui-form-item">
               <label class="layui-form-label">矿山名</label>
               <div class="layui-input-block">
                 <input type="text" name="minename"  required  lay-verify="required" class="layui-input">
               </div>
           </div>
           <div class="layui-form-item">
               <label class="layui-form-label">所在城市</label>
               <div class="layui-input-block">
                 <input type="text" name="city"  required  lay-verify="required" class="layui-input">
               </div>
           </div>
           <div class="layui-form-item">
               <label class="layui-form-label">经度</label>
               <div class="layui-input-block">
                 <input type="text" name="lat"  required  lay-verify="required" class="layui-input">
               </div>
           </div>
           <div class="layui-form-item">
               <label class="layui-form-label">纬度</label>
               <div class="layui-input-block">
                 <input type="text" name="lon"  required  lay-verify="required" class="layui-input">
               </div>
           </div>
           <div class="layui-form-item">
               <label class="layui-form-label">最大产出吨数</label>
               <div class="layui-input-block">
                 <input type="text" name="maxcount"  required  lay-verify="required" class="layui-input">
               </div>
           </div>
           <div class="layui-form-item">
            <div class="layui-input-block">
               <button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
               <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
          </div>
        </form>
     </div>
    <div class="layui-content">
        <div class="layui-page-header">
            <div class="pagewrap">
                <span class="layui-breadcrumb">
                  <a>首页</a>
                  <a>矿山信息</a>
                </span>
                
            </div>
        </div>
        <div class="layui-row">
            <div class="layui-card">
                <div class="layui-card-body">
                     <div class="demoTable">
                       <div class="layui-inline">
                                                                           矿山名称
                         <div class="layui-inline">
                             <input type="text" id="key"  class="layui-input">  
                        </div>
                        </div>
                      <button class="layui-btn" data-type="reload">查询</button>
                    </div>
                    <table id="demo" lay-filter="demo" ></table>
                </div>
            </div>
        </div>
    </div>
   </div>
    <script src="<%=basePath%>assets/layui.all.js"></script>
    <script type="text/html" id="toolbarDemo">
     <div class="layui-btn-container">
        <button class="layui-btn layui-btn-sm" lay-event="add">添加</button>
     </div>
    </script>
    <script type="text/html" id="barDemo">
      <a class="layui-btn layui-btn-success layui-btn-xs" lay-event="edit">编辑</a>
      <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
    </script>
    
   

    <script>
    layui.use('table', function(){
    	 var table = layui.table,form = layui.form,$=layui.$;
    	//展示已知数据
        table.render({
           elem: '#demo'
          ,toolbar: '#toolbarDemo'

          ,url:'<%=basePath%>mine/search'
          ,cols: [[ //标题栏
             {field: 'minename', title: '矿山名' }
            ,{field: 'city', title: '所在城市'}
            ,{field: 'lat', title: '经度'}
            ,{field: 'lon', title: '纬度'}
            ,{field: 'maxcount', title: '最大产出吨数'}
            ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:150}
           
         ]]
         
        ,id:'testReload'
        ,skin: 'line' //表格风格
        ,even: true
        ,page: true //是否显示分页
        ,limits: [5, 7, 10]
        ,limit: 5 //每页默认显示的数量
       });
       var  active = {
    	       reload: function(){
    	         var key = $('#key');
    	        // var usertype = $('#usertype');
    	         //执行重载
    	         table.reload('testReload', {
    	           page: {
    	             curr: 1 //重新从第 1 页开始
    	           }
    	           ,where: {
    	             key: key.val(),
    	           }
    	         });
    	       }
    	     };
    	     
       $('.demoTable .layui-btn').on('click', function(){
    	    var type = $(this).data('type');
    	    active[type] ? active[type].call(this) : '';
    	});
       function renderForm(){
   	    layui.use('form', function(){
   	        var form = layui.form;//高版本建议把括号去掉，有的低版本，需要加()
   	        form.render();
   	    });
       }
       //头工具栏事件
       table.on('toolbar(demo)', function(obj){
    	  switch(obj.event){
    	  case 'add':
    	        add()
    	       break;
    	         
    	  };
       });
       
       //监听行工具事件
       table.on('tool(demo)', function(obj){
         var data = obj.data;
         //console.log(obj)
         if(obj.event === 'del'){
           layer.confirm('真的删除行么', function(index){
        	  $.ajax({
                   url:" <%=basePath%>mine/delete",
                   type:'post',//method请求方式，get或者post
                   dataType:'json',//预期服务器返回的数据类型
                   data:JSON.stringify({id:data.id}),
                   contentType: "application/json; charset=utf-8",
                   success:function(res){//res为相应体,function为回调函数
                	   obj.del();
                       layer.close(index);
                       $(".layui-laypage-btn")[0].click();
                    
                   },
                   error:function(){
                       layer.alert('操作失败！！！',{icon:5});
                   }
                 });
           
           });
         }else{
        	 add(data)
         }
       });
       
       function add(data){
    	   let row = data
    	   layer.open({
    	         type: 1
    	        ,title: false //不显示标题栏
    	        ,closeBtn: true
    	        ,area: ['400px','300px']
    	        ,shade: 0.8
    	        ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
    	        ,btnAlign: 'c'
    	        ,moveType: 1 //拖拽模式，0或者1
    	        ,content: $("#box"),
    	         success:function(layero, index){
    	        	  $("#addGoodsForm")[0].reset();
  	        	       renderForm()
                      layui.use('laydate', function(){
    	             	  var laydate = layui.laydate;
    	             	   //执行一个laydate实例
    	             	  laydate.render({
    	             	    elem: '#createDate' //指定元素
    	             	  });
    	               });
                      //表单初始赋值
                      
                      row?form.val('formTest', row):form.val('formTest', {})
                      //监听提交
                      form.on('submit(demo1)', function(data){
                    	  data.field.id = row?row.id:''
                    	  $.ajax({
                              url:"<%=basePath%>mine/addOrUpdate",
                              type:'post',//method请求方式，get或者post
                              dataType:'json',//预期服务器返回的数据类型
                              data:JSON.stringify(data.field),
                              contentType: "application/json; charset=utf-8",
                              success:function(res){//res为相应体,function为回调函数
                            	  layer.close(index)
                                  $(".layui-laypage-btn")[0].click();
                              },
                              error:function(){
                               
                              }
                          });
                      
                        return false;
                      });
    	        	
  	    	       }
      	        ,end:function(index){
    	        	layer.close(index)
    	        }
    	      })
        }
     
     
});
   </script>
</body>
</html>