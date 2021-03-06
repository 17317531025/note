package com.ist.svc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BagDrawExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BagDrawExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBagNoIsNull() {
            addCriterion("bag_no is null");
            return (Criteria) this;
        }

        public Criteria andBagNoIsNotNull() {
            addCriterion("bag_no is not null");
            return (Criteria) this;
        }

        public Criteria andBagNoEqualTo(BigDecimal value) {
            addCriterion("bag_no =", value, "bagNo");
            return (Criteria) this;
        }

        public Criteria andBagNoNotEqualTo(BigDecimal value) {
            addCriterion("bag_no <>", value, "bagNo");
            return (Criteria) this;
        }

        public Criteria andBagNoGreaterThan(BigDecimal value) {
            addCriterion("bag_no >", value, "bagNo");
            return (Criteria) this;
        }

        public Criteria andBagNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bag_no >=", value, "bagNo");
            return (Criteria) this;
        }

        public Criteria andBagNoLessThan(BigDecimal value) {
            addCriterion("bag_no <", value, "bagNo");
            return (Criteria) this;
        }

        public Criteria andBagNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bag_no <=", value, "bagNo");
            return (Criteria) this;
        }

        public Criteria andBagNoIn(List<BigDecimal> values) {
            addCriterion("bag_no in", values, "bagNo");
            return (Criteria) this;
        }

        public Criteria andBagNoNotIn(List<BigDecimal> values) {
            addCriterion("bag_no not in", values, "bagNo");
            return (Criteria) this;
        }

        public Criteria andBagNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bag_no between", value1, value2, "bagNo");
            return (Criteria) this;
        }

        public Criteria andBagNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bag_no not between", value1, value2, "bagNo");
            return (Criteria) this;
        }

        public Criteria andDrawUserIsNull() {
            addCriterion("draw_user is null");
            return (Criteria) this;
        }

        public Criteria andDrawUserIsNotNull() {
            addCriterion("draw_user is not null");
            return (Criteria) this;
        }

        public Criteria andDrawUserEqualTo(Long value) {
            addCriterion("draw_user =", value, "drawUser");
            return (Criteria) this;
        }

        public Criteria andDrawUserNotEqualTo(Long value) {
            addCriterion("draw_user <>", value, "drawUser");
            return (Criteria) this;
        }

        public Criteria andDrawUserGreaterThan(Long value) {
            addCriterion("draw_user >", value, "drawUser");
            return (Criteria) this;
        }

        public Criteria andDrawUserGreaterThanOrEqualTo(Long value) {
            addCriterion("draw_user >=", value, "drawUser");
            return (Criteria) this;
        }

        public Criteria andDrawUserLessThan(Long value) {
            addCriterion("draw_user <", value, "drawUser");
            return (Criteria) this;
        }

        public Criteria andDrawUserLessThanOrEqualTo(Long value) {
            addCriterion("draw_user <=", value, "drawUser");
            return (Criteria) this;
        }

        public Criteria andDrawUserIn(List<Long> values) {
            addCriterion("draw_user in", values, "drawUser");
            return (Criteria) this;
        }

        public Criteria andDrawUserNotIn(List<Long> values) {
            addCriterion("draw_user not in", values, "drawUser");
            return (Criteria) this;
        }

        public Criteria andDrawUserBetween(Long value1, Long value2) {
            addCriterion("draw_user between", value1, value2, "drawUser");
            return (Criteria) this;
        }

        public Criteria andDrawUserNotBetween(Long value1, Long value2) {
            addCriterion("draw_user not between", value1, value2, "drawUser");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andBlanceAmountIsNull() {
            addCriterion("blance_amount is null");
            return (Criteria) this;
        }

        public Criteria andBlanceAmountIsNotNull() {
            addCriterion("blance_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBlanceAmountEqualTo(Short value) {
            addCriterion("blance_amount =", value, "blanceAmount");
            return (Criteria) this;
        }

        public Criteria andBlanceAmountNotEqualTo(Short value) {
            addCriterion("blance_amount <>", value, "blanceAmount");
            return (Criteria) this;
        }

        public Criteria andBlanceAmountGreaterThan(Short value) {
            addCriterion("blance_amount >", value, "blanceAmount");
            return (Criteria) this;
        }

        public Criteria andBlanceAmountGreaterThanOrEqualTo(Short value) {
            addCriterion("blance_amount >=", value, "blanceAmount");
            return (Criteria) this;
        }

        public Criteria andBlanceAmountLessThan(Short value) {
            addCriterion("blance_amount <", value, "blanceAmount");
            return (Criteria) this;
        }

        public Criteria andBlanceAmountLessThanOrEqualTo(Short value) {
            addCriterion("blance_amount <=", value, "blanceAmount");
            return (Criteria) this;
        }

        public Criteria andBlanceAmountIn(List<Short> values) {
            addCriterion("blance_amount in", values, "blanceAmount");
            return (Criteria) this;
        }

        public Criteria andBlanceAmountNotIn(List<Short> values) {
            addCriterion("blance_amount not in", values, "blanceAmount");
            return (Criteria) this;
        }

        public Criteria andBlanceAmountBetween(Short value1, Short value2) {
            addCriterion("blance_amount between", value1, value2, "blanceAmount");
            return (Criteria) this;
        }

        public Criteria andBlanceAmountNotBetween(Short value1, Short value2) {
            addCriterion("blance_amount not between", value1, value2, "blanceAmount");
            return (Criteria) this;
        }

        public Criteria andBlanceMoneyIsNull() {
            addCriterion("blance_money is null");
            return (Criteria) this;
        }

        public Criteria andBlanceMoneyIsNotNull() {
            addCriterion("blance_money is not null");
            return (Criteria) this;
        }

        public Criteria andBlanceMoneyEqualTo(Float value) {
            addCriterion("blance_money =", value, "blanceMoney");
            return (Criteria) this;
        }

        public Criteria andBlanceMoneyNotEqualTo(Float value) {
            addCriterion("blance_money <>", value, "blanceMoney");
            return (Criteria) this;
        }

        public Criteria andBlanceMoneyGreaterThan(Float value) {
            addCriterion("blance_money >", value, "blanceMoney");
            return (Criteria) this;
        }

        public Criteria andBlanceMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("blance_money >=", value, "blanceMoney");
            return (Criteria) this;
        }

        public Criteria andBlanceMoneyLessThan(Float value) {
            addCriterion("blance_money <", value, "blanceMoney");
            return (Criteria) this;
        }

        public Criteria andBlanceMoneyLessThanOrEqualTo(Float value) {
            addCriterion("blance_money <=", value, "blanceMoney");
            return (Criteria) this;
        }

        public Criteria andBlanceMoneyIn(List<Float> values) {
            addCriterion("blance_money in", values, "blanceMoney");
            return (Criteria) this;
        }

        public Criteria andBlanceMoneyNotIn(List<Float> values) {
            addCriterion("blance_money not in", values, "blanceMoney");
            return (Criteria) this;
        }

        public Criteria andBlanceMoneyBetween(Float value1, Float value2) {
            addCriterion("blance_money between", value1, value2, "blanceMoney");
            return (Criteria) this;
        }

        public Criteria andBlanceMoneyNotBetween(Float value1, Float value2) {
            addCriterion("blance_money not between", value1, value2, "blanceMoney");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyIsNull() {
            addCriterion("draw_money is null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyIsNotNull() {
            addCriterion("draw_money is not null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyEqualTo(Float value) {
            addCriterion("draw_money =", value, "drawMoney");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyNotEqualTo(Float value) {
            addCriterion("draw_money <>", value, "drawMoney");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyGreaterThan(Float value) {
            addCriterion("draw_money >", value, "drawMoney");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("draw_money >=", value, "drawMoney");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyLessThan(Float value) {
            addCriterion("draw_money <", value, "drawMoney");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyLessThanOrEqualTo(Float value) {
            addCriterion("draw_money <=", value, "drawMoney");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyIn(List<Float> values) {
            addCriterion("draw_money in", values, "drawMoney");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyNotIn(List<Float> values) {
            addCriterion("draw_money not in", values, "drawMoney");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyBetween(Float value1, Float value2) {
            addCriterion("draw_money between", value1, value2, "drawMoney");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyNotBetween(Float value1, Float value2) {
            addCriterion("draw_money not between", value1, value2, "drawMoney");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
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