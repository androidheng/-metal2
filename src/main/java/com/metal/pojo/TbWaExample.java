package com.metal.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbWaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbWaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWanameIsNull() {
            addCriterion("waname is null");
            return (Criteria) this;
        }

        public Criteria andWanameIsNotNull() {
            addCriterion("waname is not null");
            return (Criteria) this;
        }

        public Criteria andWanameEqualTo(String value) {
            addCriterion("waname =", value, "waname");
            return (Criteria) this;
        }

        public Criteria andWanameNotEqualTo(String value) {
            addCriterion("waname <>", value, "waname");
            return (Criteria) this;
        }

        public Criteria andWanameGreaterThan(String value) {
            addCriterion("waname >", value, "waname");
            return (Criteria) this;
        }

        public Criteria andWanameGreaterThanOrEqualTo(String value) {
            addCriterion("waname >=", value, "waname");
            return (Criteria) this;
        }

        public Criteria andWanameLessThan(String value) {
            addCriterion("waname <", value, "waname");
            return (Criteria) this;
        }

        public Criteria andWanameLessThanOrEqualTo(String value) {
            addCriterion("waname <=", value, "waname");
            return (Criteria) this;
        }

        public Criteria andWanameLike(String value) {
            addCriterion("waname like", value, "waname");
            return (Criteria) this;
        }

        public Criteria andWanameNotLike(String value) {
            addCriterion("waname not like", value, "waname");
            return (Criteria) this;
        }

        public Criteria andWanameIn(List<String> values) {
            addCriterion("waname in", values, "waname");
            return (Criteria) this;
        }

        public Criteria andWanameNotIn(List<String> values) {
            addCriterion("waname not in", values, "waname");
            return (Criteria) this;
        }

        public Criteria andWanameBetween(String value1, String value2) {
            addCriterion("waname between", value1, value2, "waname");
            return (Criteria) this;
        }

        public Criteria andWanameNotBetween(String value1, String value2) {
            addCriterion("waname not between", value1, value2, "waname");
            return (Criteria) this;
        }

        public Criteria andMaxcountIsNull() {
            addCriterion("maxcount is null");
            return (Criteria) this;
        }

        public Criteria andMaxcountIsNotNull() {
            addCriterion("maxcount is not null");
            return (Criteria) this;
        }

        public Criteria andMaxcountEqualTo(String value) {
            addCriterion("maxcount =", value, "maxcount");
            return (Criteria) this;
        }

        public Criteria andMaxcountNotEqualTo(String value) {
            addCriterion("maxcount <>", value, "maxcount");
            return (Criteria) this;
        }

        public Criteria andMaxcountGreaterThan(String value) {
            addCriterion("maxcount >", value, "maxcount");
            return (Criteria) this;
        }

        public Criteria andMaxcountGreaterThanOrEqualTo(String value) {
            addCriterion("maxcount >=", value, "maxcount");
            return (Criteria) this;
        }

        public Criteria andMaxcountLessThan(String value) {
            addCriterion("maxcount <", value, "maxcount");
            return (Criteria) this;
        }

        public Criteria andMaxcountLessThanOrEqualTo(String value) {
            addCriterion("maxcount <=", value, "maxcount");
            return (Criteria) this;
        }

        public Criteria andMaxcountLike(String value) {
            addCriterion("maxcount like", value, "maxcount");
            return (Criteria) this;
        }

        public Criteria andMaxcountNotLike(String value) {
            addCriterion("maxcount not like", value, "maxcount");
            return (Criteria) this;
        }

        public Criteria andMaxcountIn(List<String> values) {
            addCriterion("maxcount in", values, "maxcount");
            return (Criteria) this;
        }

        public Criteria andMaxcountNotIn(List<String> values) {
            addCriterion("maxcount not in", values, "maxcount");
            return (Criteria) this;
        }

        public Criteria andMaxcountBetween(String value1, String value2) {
            addCriterion("maxcount between", value1, value2, "maxcount");
            return (Criteria) this;
        }

        public Criteria andMaxcountNotBetween(String value1, String value2) {
            addCriterion("maxcount not between", value1, value2, "maxcount");
            return (Criteria) this;
        }

        public Criteria andNoIsNull() {
            addCriterion("no is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("no is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(String value) {
            addCriterion("no =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(String value) {
            addCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(String value) {
            addCriterion("no >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(String value) {
            addCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(String value) {
            addCriterion("no <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(String value) {
            addCriterion("no <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLike(String value) {
            addCriterion("no like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotLike(String value) {
            addCriterion("no not like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<String> values) {
            addCriterion("no in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<String> values) {
            addCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(String value1, String value2) {
            addCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(String value1, String value2) {
            addCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}