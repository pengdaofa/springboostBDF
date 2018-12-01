package com.pengdf.demo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class YhExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YhExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andYhidIsNull() {
            addCriterion("YHID is null");
            return (Criteria) this;
        }

        public Criteria andYhidIsNotNull() {
            addCriterion("YHID is not null");
            return (Criteria) this;
        }

        public Criteria andYhidEqualTo(String value) {
            addCriterion("YHID =", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidNotEqualTo(String value) {
            addCriterion("YHID <>", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidGreaterThan(String value) {
            addCriterion("YHID >", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidGreaterThanOrEqualTo(String value) {
            addCriterion("YHID >=", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidLessThan(String value) {
            addCriterion("YHID <", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidLessThanOrEqualTo(String value) {
            addCriterion("YHID <=", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidLike(String value) {
            addCriterion("YHID like", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidNotLike(String value) {
            addCriterion("YHID not like", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidIn(List<String> values) {
            addCriterion("YHID in", values, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidNotIn(List<String> values) {
            addCriterion("YHID not in", values, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidBetween(String value1, String value2) {
            addCriterion("YHID between", value1, value2, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidNotBetween(String value1, String value2) {
            addCriterion("YHID not between", value1, value2, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhmcIsNull() {
            addCriterion("YHMC is null");
            return (Criteria) this;
        }

        public Criteria andYhmcIsNotNull() {
            addCriterion("YHMC is not null");
            return (Criteria) this;
        }

        public Criteria andYhmcEqualTo(String value) {
            addCriterion("YHMC =", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcNotEqualTo(String value) {
            addCriterion("YHMC <>", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcGreaterThan(String value) {
            addCriterion("YHMC >", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcGreaterThanOrEqualTo(String value) {
            addCriterion("YHMC >=", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcLessThan(String value) {
            addCriterion("YHMC <", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcLessThanOrEqualTo(String value) {
            addCriterion("YHMC <=", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcLike(String value) {
            addCriterion("YHMC like", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcNotLike(String value) {
            addCriterion("YHMC not like", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcIn(List<String> values) {
            addCriterion("YHMC in", values, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcNotIn(List<String> values) {
            addCriterion("YHMC not in", values, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcBetween(String value1, String value2) {
            addCriterion("YHMC between", value1, value2, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcNotBetween(String value1, String value2) {
            addCriterion("YHMC not between", value1, value2, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmmIsNull() {
            addCriterion("YHMM is null");
            return (Criteria) this;
        }

        public Criteria andYhmmIsNotNull() {
            addCriterion("YHMM is not null");
            return (Criteria) this;
        }

        public Criteria andYhmmEqualTo(String value) {
            addCriterion("YHMM =", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmNotEqualTo(String value) {
            addCriterion("YHMM <>", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmGreaterThan(String value) {
            addCriterion("YHMM >", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmGreaterThanOrEqualTo(String value) {
            addCriterion("YHMM >=", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmLessThan(String value) {
            addCriterion("YHMM <", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmLessThanOrEqualTo(String value) {
            addCriterion("YHMM <=", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmLike(String value) {
            addCriterion("YHMM like", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmNotLike(String value) {
            addCriterion("YHMM not like", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmIn(List<String> values) {
            addCriterion("YHMM in", values, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmNotIn(List<String> values) {
            addCriterion("YHMM not in", values, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmBetween(String value1, String value2) {
            addCriterion("YHMM between", value1, value2, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmNotBetween(String value1, String value2) {
            addCriterion("YHMM not between", value1, value2, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhzwIsNull() {
            addCriterion("YHZW is null");
            return (Criteria) this;
        }

        public Criteria andYhzwIsNotNull() {
            addCriterion("YHZW is not null");
            return (Criteria) this;
        }

        public Criteria andYhzwEqualTo(String value) {
            addCriterion("YHZW =", value, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYhzwNotEqualTo(String value) {
            addCriterion("YHZW <>", value, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYhzwGreaterThan(String value) {
            addCriterion("YHZW >", value, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYhzwGreaterThanOrEqualTo(String value) {
            addCriterion("YHZW >=", value, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYhzwLessThan(String value) {
            addCriterion("YHZW <", value, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYhzwLessThanOrEqualTo(String value) {
            addCriterion("YHZW <=", value, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYhzwLike(String value) {
            addCriterion("YHZW like", value, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYhzwNotLike(String value) {
            addCriterion("YHZW not like", value, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYhzwIn(List<String> values) {
            addCriterion("YHZW in", values, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYhzwNotIn(List<String> values) {
            addCriterion("YHZW not in", values, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYhzwBetween(String value1, String value2) {
            addCriterion("YHZW between", value1, value2, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYhzwNotBetween(String value1, String value2) {
            addCriterion("YHZW not between", value1, value2, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYhsjIsNull() {
            addCriterion("YHSJ is null");
            return (Criteria) this;
        }

        public Criteria andYhsjIsNotNull() {
            addCriterion("YHSJ is not null");
            return (Criteria) this;
        }

        public Criteria andYhsjEqualTo(String value) {
            addCriterion("YHSJ =", value, "yhsj");
            return (Criteria) this;
        }

        public Criteria andYhsjNotEqualTo(String value) {
            addCriterion("YHSJ <>", value, "yhsj");
            return (Criteria) this;
        }

        public Criteria andYhsjGreaterThan(String value) {
            addCriterion("YHSJ >", value, "yhsj");
            return (Criteria) this;
        }

        public Criteria andYhsjGreaterThanOrEqualTo(String value) {
            addCriterion("YHSJ >=", value, "yhsj");
            return (Criteria) this;
        }

        public Criteria andYhsjLessThan(String value) {
            addCriterion("YHSJ <", value, "yhsj");
            return (Criteria) this;
        }

        public Criteria andYhsjLessThanOrEqualTo(String value) {
            addCriterion("YHSJ <=", value, "yhsj");
            return (Criteria) this;
        }

        public Criteria andYhsjLike(String value) {
            addCriterion("YHSJ like", value, "yhsj");
            return (Criteria) this;
        }

        public Criteria andYhsjNotLike(String value) {
            addCriterion("YHSJ not like", value, "yhsj");
            return (Criteria) this;
        }

        public Criteria andYhsjIn(List<String> values) {
            addCriterion("YHSJ in", values, "yhsj");
            return (Criteria) this;
        }

        public Criteria andYhsjNotIn(List<String> values) {
            addCriterion("YHSJ not in", values, "yhsj");
            return (Criteria) this;
        }

        public Criteria andYhsjBetween(String value1, String value2) {
            addCriterion("YHSJ between", value1, value2, "yhsj");
            return (Criteria) this;
        }

        public Criteria andYhsjNotBetween(String value1, String value2) {
            addCriterion("YHSJ not between", value1, value2, "yhsj");
            return (Criteria) this;
        }

        public Criteria andBgdhIsNull() {
            addCriterion("BGDH is null");
            return (Criteria) this;
        }

        public Criteria andBgdhIsNotNull() {
            addCriterion("BGDH is not null");
            return (Criteria) this;
        }

        public Criteria andBgdhEqualTo(String value) {
            addCriterion("BGDH =", value, "bgdh");
            return (Criteria) this;
        }

        public Criteria andBgdhNotEqualTo(String value) {
            addCriterion("BGDH <>", value, "bgdh");
            return (Criteria) this;
        }

        public Criteria andBgdhGreaterThan(String value) {
            addCriterion("BGDH >", value, "bgdh");
            return (Criteria) this;
        }

        public Criteria andBgdhGreaterThanOrEqualTo(String value) {
            addCriterion("BGDH >=", value, "bgdh");
            return (Criteria) this;
        }

        public Criteria andBgdhLessThan(String value) {
            addCriterion("BGDH <", value, "bgdh");
            return (Criteria) this;
        }

        public Criteria andBgdhLessThanOrEqualTo(String value) {
            addCriterion("BGDH <=", value, "bgdh");
            return (Criteria) this;
        }

        public Criteria andBgdhLike(String value) {
            addCriterion("BGDH like", value, "bgdh");
            return (Criteria) this;
        }

        public Criteria andBgdhNotLike(String value) {
            addCriterion("BGDH not like", value, "bgdh");
            return (Criteria) this;
        }

        public Criteria andBgdhIn(List<String> values) {
            addCriterion("BGDH in", values, "bgdh");
            return (Criteria) this;
        }

        public Criteria andBgdhNotIn(List<String> values) {
            addCriterion("BGDH not in", values, "bgdh");
            return (Criteria) this;
        }

        public Criteria andBgdhBetween(String value1, String value2) {
            addCriterion("BGDH between", value1, value2, "bgdh");
            return (Criteria) this;
        }

        public Criteria andBgdhNotBetween(String value1, String value2) {
            addCriterion("BGDH not between", value1, value2, "bgdh");
            return (Criteria) this;
        }

        public Criteria andPyjxIsNull() {
            addCriterion("PYJX is null");
            return (Criteria) this;
        }

        public Criteria andPyjxIsNotNull() {
            addCriterion("PYJX is not null");
            return (Criteria) this;
        }

        public Criteria andPyjxEqualTo(String value) {
            addCriterion("PYJX =", value, "pyjx");
            return (Criteria) this;
        }

        public Criteria andPyjxNotEqualTo(String value) {
            addCriterion("PYJX <>", value, "pyjx");
            return (Criteria) this;
        }

        public Criteria andPyjxGreaterThan(String value) {
            addCriterion("PYJX >", value, "pyjx");
            return (Criteria) this;
        }

        public Criteria andPyjxGreaterThanOrEqualTo(String value) {
            addCriterion("PYJX >=", value, "pyjx");
            return (Criteria) this;
        }

        public Criteria andPyjxLessThan(String value) {
            addCriterion("PYJX <", value, "pyjx");
            return (Criteria) this;
        }

        public Criteria andPyjxLessThanOrEqualTo(String value) {
            addCriterion("PYJX <=", value, "pyjx");
            return (Criteria) this;
        }

        public Criteria andPyjxLike(String value) {
            addCriterion("PYJX like", value, "pyjx");
            return (Criteria) this;
        }

        public Criteria andPyjxNotLike(String value) {
            addCriterion("PYJX not like", value, "pyjx");
            return (Criteria) this;
        }

        public Criteria andPyjxIn(List<String> values) {
            addCriterion("PYJX in", values, "pyjx");
            return (Criteria) this;
        }

        public Criteria andPyjxNotIn(List<String> values) {
            addCriterion("PYJX not in", values, "pyjx");
            return (Criteria) this;
        }

        public Criteria andPyjxBetween(String value1, String value2) {
            addCriterion("PYJX between", value1, value2, "pyjx");
            return (Criteria) this;
        }

        public Criteria andPyjxNotBetween(String value1, String value2) {
            addCriterion("PYJX not between", value1, value2, "pyjx");
            return (Criteria) this;
        }

        public Criteria andBmbhIsNull() {
            addCriterion("BMBH is null");
            return (Criteria) this;
        }

        public Criteria andBmbhIsNotNull() {
            addCriterion("BMBH is not null");
            return (Criteria) this;
        }

        public Criteria andBmbhEqualTo(String value) {
            addCriterion("BMBH =", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhNotEqualTo(String value) {
            addCriterion("BMBH <>", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhGreaterThan(String value) {
            addCriterion("BMBH >", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhGreaterThanOrEqualTo(String value) {
            addCriterion("BMBH >=", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhLessThan(String value) {
            addCriterion("BMBH <", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhLessThanOrEqualTo(String value) {
            addCriterion("BMBH <=", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhLike(String value) {
            addCriterion("BMBH like", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhNotLike(String value) {
            addCriterion("BMBH not like", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhIn(List<String> values) {
            addCriterion("BMBH in", values, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhNotIn(List<String> values) {
            addCriterion("BMBH not in", values, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhBetween(String value1, String value2) {
            addCriterion("BMBH between", value1, value2, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhNotBetween(String value1, String value2) {
            addCriterion("BMBH not between", value1, value2, "bmbh");
            return (Criteria) this;
        }

        public Criteria andXbIsNull() {
            addCriterion("XB is null");
            return (Criteria) this;
        }

        public Criteria andXbIsNotNull() {
            addCriterion("XB is not null");
            return (Criteria) this;
        }

        public Criteria andXbEqualTo(String value) {
            addCriterion("XB =", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotEqualTo(String value) {
            addCriterion("XB <>", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThan(String value) {
            addCriterion("XB >", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThanOrEqualTo(String value) {
            addCriterion("XB >=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThan(String value) {
            addCriterion("XB <", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThanOrEqualTo(String value) {
            addCriterion("XB <=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLike(String value) {
            addCriterion("XB like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotLike(String value) {
            addCriterion("XB not like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbIn(List<String> values) {
            addCriterion("XB in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotIn(List<String> values) {
            addCriterion("XB not in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbBetween(String value1, String value2) {
            addCriterion("XB between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotBetween(String value1, String value2) {
            addCriterion("XB not between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andSfyxIsNull() {
            addCriterion("SFYX is null");
            return (Criteria) this;
        }

        public Criteria andSfyxIsNotNull() {
            addCriterion("SFYX is not null");
            return (Criteria) this;
        }

        public Criteria andSfyxEqualTo(Short value) {
            addCriterion("SFYX =", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxNotEqualTo(Short value) {
            addCriterion("SFYX <>", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxGreaterThan(Short value) {
            addCriterion("SFYX >", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxGreaterThanOrEqualTo(Short value) {
            addCriterion("SFYX >=", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxLessThan(Short value) {
            addCriterion("SFYX <", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxLessThanOrEqualTo(Short value) {
            addCriterion("SFYX <=", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxIn(List<Short> values) {
            addCriterion("SFYX in", values, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxNotIn(List<Short> values) {
            addCriterion("SFYX not in", values, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxBetween(Short value1, Short value2) {
            addCriterion("SFYX between", value1, value2, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxNotBetween(Short value1, Short value2) {
            addCriterion("SFYX not between", value1, value2, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfzgIsNull() {
            addCriterion("SFZG is null");
            return (Criteria) this;
        }

        public Criteria andSfzgIsNotNull() {
            addCriterion("SFZG is not null");
            return (Criteria) this;
        }

        public Criteria andSfzgEqualTo(Short value) {
            addCriterion("SFZG =", value, "sfzg");
            return (Criteria) this;
        }

        public Criteria andSfzgNotEqualTo(Short value) {
            addCriterion("SFZG <>", value, "sfzg");
            return (Criteria) this;
        }

        public Criteria andSfzgGreaterThan(Short value) {
            addCriterion("SFZG >", value, "sfzg");
            return (Criteria) this;
        }

        public Criteria andSfzgGreaterThanOrEqualTo(Short value) {
            addCriterion("SFZG >=", value, "sfzg");
            return (Criteria) this;
        }

        public Criteria andSfzgLessThan(Short value) {
            addCriterion("SFZG <", value, "sfzg");
            return (Criteria) this;
        }

        public Criteria andSfzgLessThanOrEqualTo(Short value) {
            addCriterion("SFZG <=", value, "sfzg");
            return (Criteria) this;
        }

        public Criteria andSfzgIn(List<Short> values) {
            addCriterion("SFZG in", values, "sfzg");
            return (Criteria) this;
        }

        public Criteria andSfzgNotIn(List<Short> values) {
            addCriterion("SFZG not in", values, "sfzg");
            return (Criteria) this;
        }

        public Criteria andSfzgBetween(Short value1, Short value2) {
            addCriterion("SFZG between", value1, value2, "sfzg");
            return (Criteria) this;
        }

        public Criteria andSfzgNotBetween(Short value1, Short value2) {
            addCriterion("SFZG not between", value1, value2, "sfzg");
            return (Criteria) this;
        }

        public Criteria andPxhIsNull() {
            addCriterion("PXH is null");
            return (Criteria) this;
        }

        public Criteria andPxhIsNotNull() {
            addCriterion("PXH is not null");
            return (Criteria) this;
        }

        public Criteria andPxhEqualTo(Integer value) {
            addCriterion("PXH =", value, "pxh");
            return (Criteria) this;
        }

        public Criteria andPxhNotEqualTo(Integer value) {
            addCriterion("PXH <>", value, "pxh");
            return (Criteria) this;
        }

        public Criteria andPxhGreaterThan(Integer value) {
            addCriterion("PXH >", value, "pxh");
            return (Criteria) this;
        }

        public Criteria andPxhGreaterThanOrEqualTo(Integer value) {
            addCriterion("PXH >=", value, "pxh");
            return (Criteria) this;
        }

        public Criteria andPxhLessThan(Integer value) {
            addCriterion("PXH <", value, "pxh");
            return (Criteria) this;
        }

        public Criteria andPxhLessThanOrEqualTo(Integer value) {
            addCriterion("PXH <=", value, "pxh");
            return (Criteria) this;
        }

        public Criteria andPxhIn(List<Integer> values) {
            addCriterion("PXH in", values, "pxh");
            return (Criteria) this;
        }

        public Criteria andPxhNotIn(List<Integer> values) {
            addCriterion("PXH not in", values, "pxh");
            return (Criteria) this;
        }

        public Criteria andPxhBetween(Integer value1, Integer value2) {
            addCriterion("PXH between", value1, value2, "pxh");
            return (Criteria) this;
        }

        public Criteria andPxhNotBetween(Integer value1, Integer value2) {
            addCriterion("PXH not between", value1, value2, "pxh");
            return (Criteria) this;
        }

        public Criteria andNwyxIsNull() {
            addCriterion("NWYX is null");
            return (Criteria) this;
        }

        public Criteria andNwyxIsNotNull() {
            addCriterion("NWYX is not null");
            return (Criteria) this;
        }

        public Criteria andNwyxEqualTo(String value) {
            addCriterion("NWYX =", value, "nwyx");
            return (Criteria) this;
        }

        public Criteria andNwyxNotEqualTo(String value) {
            addCriterion("NWYX <>", value, "nwyx");
            return (Criteria) this;
        }

        public Criteria andNwyxGreaterThan(String value) {
            addCriterion("NWYX >", value, "nwyx");
            return (Criteria) this;
        }

        public Criteria andNwyxGreaterThanOrEqualTo(String value) {
            addCriterion("NWYX >=", value, "nwyx");
            return (Criteria) this;
        }

        public Criteria andNwyxLessThan(String value) {
            addCriterion("NWYX <", value, "nwyx");
            return (Criteria) this;
        }

        public Criteria andNwyxLessThanOrEqualTo(String value) {
            addCriterion("NWYX <=", value, "nwyx");
            return (Criteria) this;
        }

        public Criteria andNwyxLike(String value) {
            addCriterion("NWYX like", value, "nwyx");
            return (Criteria) this;
        }

        public Criteria andNwyxNotLike(String value) {
            addCriterion("NWYX not like", value, "nwyx");
            return (Criteria) this;
        }

        public Criteria andNwyxIn(List<String> values) {
            addCriterion("NWYX in", values, "nwyx");
            return (Criteria) this;
        }

        public Criteria andNwyxNotIn(List<String> values) {
            addCriterion("NWYX not in", values, "nwyx");
            return (Criteria) this;
        }

        public Criteria andNwyxBetween(String value1, String value2) {
            addCriterion("NWYX between", value1, value2, "nwyx");
            return (Criteria) this;
        }

        public Criteria andNwyxNotBetween(String value1, String value2) {
            addCriterion("NWYX not between", value1, value2, "nwyx");
            return (Criteria) this;
        }

        public Criteria andNwyxmmIsNull() {
            addCriterion("NWYXMM is null");
            return (Criteria) this;
        }

        public Criteria andNwyxmmIsNotNull() {
            addCriterion("NWYXMM is not null");
            return (Criteria) this;
        }

        public Criteria andNwyxmmEqualTo(String value) {
            addCriterion("NWYXMM =", value, "nwyxmm");
            return (Criteria) this;
        }

        public Criteria andNwyxmmNotEqualTo(String value) {
            addCriterion("NWYXMM <>", value, "nwyxmm");
            return (Criteria) this;
        }

        public Criteria andNwyxmmGreaterThan(String value) {
            addCriterion("NWYXMM >", value, "nwyxmm");
            return (Criteria) this;
        }

        public Criteria andNwyxmmGreaterThanOrEqualTo(String value) {
            addCriterion("NWYXMM >=", value, "nwyxmm");
            return (Criteria) this;
        }

        public Criteria andNwyxmmLessThan(String value) {
            addCriterion("NWYXMM <", value, "nwyxmm");
            return (Criteria) this;
        }

        public Criteria andNwyxmmLessThanOrEqualTo(String value) {
            addCriterion("NWYXMM <=", value, "nwyxmm");
            return (Criteria) this;
        }

        public Criteria andNwyxmmLike(String value) {
            addCriterion("NWYXMM like", value, "nwyxmm");
            return (Criteria) this;
        }

        public Criteria andNwyxmmNotLike(String value) {
            addCriterion("NWYXMM not like", value, "nwyxmm");
            return (Criteria) this;
        }

        public Criteria andNwyxmmIn(List<String> values) {
            addCriterion("NWYXMM in", values, "nwyxmm");
            return (Criteria) this;
        }

        public Criteria andNwyxmmNotIn(List<String> values) {
            addCriterion("NWYXMM not in", values, "nwyxmm");
            return (Criteria) this;
        }

        public Criteria andNwyxmmBetween(String value1, String value2) {
            addCriterion("NWYXMM between", value1, value2, "nwyxmm");
            return (Criteria) this;
        }

        public Criteria andNwyxmmNotBetween(String value1, String value2) {
            addCriterion("NWYXMM not between", value1, value2, "nwyxmm");
            return (Criteria) this;
        }

        public Criteria andWwyxIsNull() {
            addCriterion("WWYX is null");
            return (Criteria) this;
        }

        public Criteria andWwyxIsNotNull() {
            addCriterion("WWYX is not null");
            return (Criteria) this;
        }

        public Criteria andWwyxEqualTo(String value) {
            addCriterion("WWYX =", value, "wwyx");
            return (Criteria) this;
        }

        public Criteria andWwyxNotEqualTo(String value) {
            addCriterion("WWYX <>", value, "wwyx");
            return (Criteria) this;
        }

        public Criteria andWwyxGreaterThan(String value) {
            addCriterion("WWYX >", value, "wwyx");
            return (Criteria) this;
        }

        public Criteria andWwyxGreaterThanOrEqualTo(String value) {
            addCriterion("WWYX >=", value, "wwyx");
            return (Criteria) this;
        }

        public Criteria andWwyxLessThan(String value) {
            addCriterion("WWYX <", value, "wwyx");
            return (Criteria) this;
        }

        public Criteria andWwyxLessThanOrEqualTo(String value) {
            addCriterion("WWYX <=", value, "wwyx");
            return (Criteria) this;
        }

        public Criteria andWwyxLike(String value) {
            addCriterion("WWYX like", value, "wwyx");
            return (Criteria) this;
        }

        public Criteria andWwyxNotLike(String value) {
            addCriterion("WWYX not like", value, "wwyx");
            return (Criteria) this;
        }

        public Criteria andWwyxIn(List<String> values) {
            addCriterion("WWYX in", values, "wwyx");
            return (Criteria) this;
        }

        public Criteria andWwyxNotIn(List<String> values) {
            addCriterion("WWYX not in", values, "wwyx");
            return (Criteria) this;
        }

        public Criteria andWwyxBetween(String value1, String value2) {
            addCriterion("WWYX between", value1, value2, "wwyx");
            return (Criteria) this;
        }

        public Criteria andWwyxNotBetween(String value1, String value2) {
            addCriterion("WWYX not between", value1, value2, "wwyx");
            return (Criteria) this;
        }

        public Criteria andWwyxmmIsNull() {
            addCriterion("WWYXMM is null");
            return (Criteria) this;
        }

        public Criteria andWwyxmmIsNotNull() {
            addCriterion("WWYXMM is not null");
            return (Criteria) this;
        }

        public Criteria andWwyxmmEqualTo(String value) {
            addCriterion("WWYXMM =", value, "wwyxmm");
            return (Criteria) this;
        }

        public Criteria andWwyxmmNotEqualTo(String value) {
            addCriterion("WWYXMM <>", value, "wwyxmm");
            return (Criteria) this;
        }

        public Criteria andWwyxmmGreaterThan(String value) {
            addCriterion("WWYXMM >", value, "wwyxmm");
            return (Criteria) this;
        }

        public Criteria andWwyxmmGreaterThanOrEqualTo(String value) {
            addCriterion("WWYXMM >=", value, "wwyxmm");
            return (Criteria) this;
        }

        public Criteria andWwyxmmLessThan(String value) {
            addCriterion("WWYXMM <", value, "wwyxmm");
            return (Criteria) this;
        }

        public Criteria andWwyxmmLessThanOrEqualTo(String value) {
            addCriterion("WWYXMM <=", value, "wwyxmm");
            return (Criteria) this;
        }

        public Criteria andWwyxmmLike(String value) {
            addCriterion("WWYXMM like", value, "wwyxmm");
            return (Criteria) this;
        }

        public Criteria andWwyxmmNotLike(String value) {
            addCriterion("WWYXMM not like", value, "wwyxmm");
            return (Criteria) this;
        }

        public Criteria andWwyxmmIn(List<String> values) {
            addCriterion("WWYXMM in", values, "wwyxmm");
            return (Criteria) this;
        }

        public Criteria andWwyxmmNotIn(List<String> values) {
            addCriterion("WWYXMM not in", values, "wwyxmm");
            return (Criteria) this;
        }

        public Criteria andWwyxmmBetween(String value1, String value2) {
            addCriterion("WWYXMM between", value1, value2, "wwyxmm");
            return (Criteria) this;
        }

        public Criteria andWwyxmmNotBetween(String value1, String value2) {
            addCriterion("WWYXMM not between", value1, value2, "wwyxmm");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("ORGID is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("ORGID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(String value) {
            addCriterion("ORGID =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(String value) {
            addCriterion("ORGID <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(String value) {
            addCriterion("ORGID >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(String value) {
            addCriterion("ORGID >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(String value) {
            addCriterion("ORGID <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(String value) {
            addCriterion("ORGID <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLike(String value) {
            addCriterion("ORGID like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotLike(String value) {
            addCriterion("ORGID not like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<String> values) {
            addCriterion("ORGID in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<String> values) {
            addCriterion("ORGID not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(String value1, String value2) {
            addCriterion("ORGID between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(String value1, String value2) {
            addCriterion("ORGID not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andYhbjIsNull() {
            addCriterion("YHBJ is null");
            return (Criteria) this;
        }

        public Criteria andYhbjIsNotNull() {
            addCriterion("YHBJ is not null");
            return (Criteria) this;
        }

        public Criteria andYhbjEqualTo(String value) {
            addCriterion("YHBJ =", value, "yhbj");
            return (Criteria) this;
        }

        public Criteria andYhbjNotEqualTo(String value) {
            addCriterion("YHBJ <>", value, "yhbj");
            return (Criteria) this;
        }

        public Criteria andYhbjGreaterThan(String value) {
            addCriterion("YHBJ >", value, "yhbj");
            return (Criteria) this;
        }

        public Criteria andYhbjGreaterThanOrEqualTo(String value) {
            addCriterion("YHBJ >=", value, "yhbj");
            return (Criteria) this;
        }

        public Criteria andYhbjLessThan(String value) {
            addCriterion("YHBJ <", value, "yhbj");
            return (Criteria) this;
        }

        public Criteria andYhbjLessThanOrEqualTo(String value) {
            addCriterion("YHBJ <=", value, "yhbj");
            return (Criteria) this;
        }

        public Criteria andYhbjLike(String value) {
            addCriterion("YHBJ like", value, "yhbj");
            return (Criteria) this;
        }

        public Criteria andYhbjNotLike(String value) {
            addCriterion("YHBJ not like", value, "yhbj");
            return (Criteria) this;
        }

        public Criteria andYhbjIn(List<String> values) {
            addCriterion("YHBJ in", values, "yhbj");
            return (Criteria) this;
        }

        public Criteria andYhbjNotIn(List<String> values) {
            addCriterion("YHBJ not in", values, "yhbj");
            return (Criteria) this;
        }

        public Criteria andYhbjBetween(String value1, String value2) {
            addCriterion("YHBJ between", value1, value2, "yhbj");
            return (Criteria) this;
        }

        public Criteria andYhbjNotBetween(String value1, String value2) {
            addCriterion("YHBJ not between", value1, value2, "yhbj");
            return (Criteria) this;
        }

        public Criteria andCjrIsNull() {
            addCriterion("CJR is null");
            return (Criteria) this;
        }

        public Criteria andCjrIsNotNull() {
            addCriterion("CJR is not null");
            return (Criteria) this;
        }

        public Criteria andCjrEqualTo(String value) {
            addCriterion("CJR =", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrNotEqualTo(String value) {
            addCriterion("CJR <>", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrGreaterThan(String value) {
            addCriterion("CJR >", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrGreaterThanOrEqualTo(String value) {
            addCriterion("CJR >=", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrLessThan(String value) {
            addCriterion("CJR <", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrLessThanOrEqualTo(String value) {
            addCriterion("CJR <=", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrLike(String value) {
            addCriterion("CJR like", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrNotLike(String value) {
            addCriterion("CJR not like", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrIn(List<String> values) {
            addCriterion("CJR in", values, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrNotIn(List<String> values) {
            addCriterion("CJR not in", values, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrBetween(String value1, String value2) {
            addCriterion("CJR between", value1, value2, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrNotBetween(String value1, String value2) {
            addCriterion("CJR not between", value1, value2, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNull() {
            addCriterion("CJSJ is null");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNotNull() {
            addCriterion("CJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andCjsjEqualTo(Date value) {
            addCriterionForJDBCDate("CJSJ =", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("CJSJ <>", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThan(Date value) {
            addCriterionForJDBCDate("CJSJ >", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CJSJ >=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThan(Date value) {
            addCriterionForJDBCDate("CJSJ <", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CJSJ <=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjIn(List<Date> values) {
            addCriterionForJDBCDate("CJSJ in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("CJSJ not in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CJSJ between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CJSJ not between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andXgrIsNull() {
            addCriterion("XGR is null");
            return (Criteria) this;
        }

        public Criteria andXgrIsNotNull() {
            addCriterion("XGR is not null");
            return (Criteria) this;
        }

        public Criteria andXgrEqualTo(String value) {
            addCriterion("XGR =", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrNotEqualTo(String value) {
            addCriterion("XGR <>", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrGreaterThan(String value) {
            addCriterion("XGR >", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrGreaterThanOrEqualTo(String value) {
            addCriterion("XGR >=", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrLessThan(String value) {
            addCriterion("XGR <", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrLessThanOrEqualTo(String value) {
            addCriterion("XGR <=", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrLike(String value) {
            addCriterion("XGR like", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrNotLike(String value) {
            addCriterion("XGR not like", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrIn(List<String> values) {
            addCriterion("XGR in", values, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrNotIn(List<String> values) {
            addCriterion("XGR not in", values, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrBetween(String value1, String value2) {
            addCriterion("XGR between", value1, value2, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrNotBetween(String value1, String value2) {
            addCriterion("XGR not between", value1, value2, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgsjIsNull() {
            addCriterion("XGSJ is null");
            return (Criteria) this;
        }

        public Criteria andXgsjIsNotNull() {
            addCriterion("XGSJ is not null");
            return (Criteria) this;
        }

        public Criteria andXgsjEqualTo(Date value) {
            addCriterionForJDBCDate("XGSJ =", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("XGSJ <>", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjGreaterThan(Date value) {
            addCriterionForJDBCDate("XGSJ >", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("XGSJ >=", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjLessThan(Date value) {
            addCriterionForJDBCDate("XGSJ <", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("XGSJ <=", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjIn(List<Date> values) {
            addCriterionForJDBCDate("XGSJ in", values, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("XGSJ not in", values, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("XGSJ between", value1, value2, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("XGSJ not between", value1, value2, "xgsj");
            return (Criteria) this;
        }

        public Criteria andZdysIsNull() {
            addCriterion("ZDYS is null");
            return (Criteria) this;
        }

        public Criteria andZdysIsNotNull() {
            addCriterion("ZDYS is not null");
            return (Criteria) this;
        }

        public Criteria andZdysEqualTo(String value) {
            addCriterion("ZDYS =", value, "zdys");
            return (Criteria) this;
        }

        public Criteria andZdysNotEqualTo(String value) {
            addCriterion("ZDYS <>", value, "zdys");
            return (Criteria) this;
        }

        public Criteria andZdysGreaterThan(String value) {
            addCriterion("ZDYS >", value, "zdys");
            return (Criteria) this;
        }

        public Criteria andZdysGreaterThanOrEqualTo(String value) {
            addCriterion("ZDYS >=", value, "zdys");
            return (Criteria) this;
        }

        public Criteria andZdysLessThan(String value) {
            addCriterion("ZDYS <", value, "zdys");
            return (Criteria) this;
        }

        public Criteria andZdysLessThanOrEqualTo(String value) {
            addCriterion("ZDYS <=", value, "zdys");
            return (Criteria) this;
        }

        public Criteria andZdysLike(String value) {
            addCriterion("ZDYS like", value, "zdys");
            return (Criteria) this;
        }

        public Criteria andZdysNotLike(String value) {
            addCriterion("ZDYS not like", value, "zdys");
            return (Criteria) this;
        }

        public Criteria andZdysIn(List<String> values) {
            addCriterion("ZDYS in", values, "zdys");
            return (Criteria) this;
        }

        public Criteria andZdysNotIn(List<String> values) {
            addCriterion("ZDYS not in", values, "zdys");
            return (Criteria) this;
        }

        public Criteria andZdysBetween(String value1, String value2) {
            addCriterion("ZDYS between", value1, value2, "zdys");
            return (Criteria) this;
        }

        public Criteria andZdysNotBetween(String value1, String value2) {
            addCriterion("ZDYS not between", value1, value2, "zdys");
            return (Criteria) this;
        }

        public Criteria andYhjbIsNull() {
            addCriterion("YHJB is null");
            return (Criteria) this;
        }

        public Criteria andYhjbIsNotNull() {
            addCriterion("YHJB is not null");
            return (Criteria) this;
        }

        public Criteria andYhjbEqualTo(String value) {
            addCriterion("YHJB =", value, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhjbNotEqualTo(String value) {
            addCriterion("YHJB <>", value, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhjbGreaterThan(String value) {
            addCriterion("YHJB >", value, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhjbGreaterThanOrEqualTo(String value) {
            addCriterion("YHJB >=", value, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhjbLessThan(String value) {
            addCriterion("YHJB <", value, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhjbLessThanOrEqualTo(String value) {
            addCriterion("YHJB <=", value, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhjbLike(String value) {
            addCriterion("YHJB like", value, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhjbNotLike(String value) {
            addCriterion("YHJB not like", value, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhjbIn(List<String> values) {
            addCriterion("YHJB in", values, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhjbNotIn(List<String> values) {
            addCriterion("YHJB not in", values, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhjbBetween(String value1, String value2) {
            addCriterion("YHJB between", value1, value2, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhjbNotBetween(String value1, String value2) {
            addCriterion("YHJB not between", value1, value2, "yhjb");
            return (Criteria) this;
        }

        public Criteria andYhcwIsNull() {
            addCriterion("YHCW is null");
            return (Criteria) this;
        }

        public Criteria andYhcwIsNotNull() {
            addCriterion("YHCW is not null");
            return (Criteria) this;
        }

        public Criteria andYhcwEqualTo(String value) {
            addCriterion("YHCW =", value, "yhcw");
            return (Criteria) this;
        }

        public Criteria andYhcwNotEqualTo(String value) {
            addCriterion("YHCW <>", value, "yhcw");
            return (Criteria) this;
        }

        public Criteria andYhcwGreaterThan(String value) {
            addCriterion("YHCW >", value, "yhcw");
            return (Criteria) this;
        }

        public Criteria andYhcwGreaterThanOrEqualTo(String value) {
            addCriterion("YHCW >=", value, "yhcw");
            return (Criteria) this;
        }

        public Criteria andYhcwLessThan(String value) {
            addCriterion("YHCW <", value, "yhcw");
            return (Criteria) this;
        }

        public Criteria andYhcwLessThanOrEqualTo(String value) {
            addCriterion("YHCW <=", value, "yhcw");
            return (Criteria) this;
        }

        public Criteria andYhcwLike(String value) {
            addCriterion("YHCW like", value, "yhcw");
            return (Criteria) this;
        }

        public Criteria andYhcwNotLike(String value) {
            addCriterion("YHCW not like", value, "yhcw");
            return (Criteria) this;
        }

        public Criteria andYhcwIn(List<String> values) {
            addCriterion("YHCW in", values, "yhcw");
            return (Criteria) this;
        }

        public Criteria andYhcwNotIn(List<String> values) {
            addCriterion("YHCW not in", values, "yhcw");
            return (Criteria) this;
        }

        public Criteria andYhcwBetween(String value1, String value2) {
            addCriterion("YHCW between", value1, value2, "yhcw");
            return (Criteria) this;
        }

        public Criteria andYhcwNotBetween(String value1, String value2) {
            addCriterion("YHCW not between", value1, value2, "yhcw");
            return (Criteria) this;
        }

        public Criteria andYhsjBakIsNull() {
            addCriterion("YHSJ_BAK is null");
            return (Criteria) this;
        }

        public Criteria andYhsjBakIsNotNull() {
            addCriterion("YHSJ_BAK is not null");
            return (Criteria) this;
        }

        public Criteria andYhsjBakEqualTo(String value) {
            addCriterion("YHSJ_BAK =", value, "yhsjBak");
            return (Criteria) this;
        }

        public Criteria andYhsjBakNotEqualTo(String value) {
            addCriterion("YHSJ_BAK <>", value, "yhsjBak");
            return (Criteria) this;
        }

        public Criteria andYhsjBakGreaterThan(String value) {
            addCriterion("YHSJ_BAK >", value, "yhsjBak");
            return (Criteria) this;
        }

        public Criteria andYhsjBakGreaterThanOrEqualTo(String value) {
            addCriterion("YHSJ_BAK >=", value, "yhsjBak");
            return (Criteria) this;
        }

        public Criteria andYhsjBakLessThan(String value) {
            addCriterion("YHSJ_BAK <", value, "yhsjBak");
            return (Criteria) this;
        }

        public Criteria andYhsjBakLessThanOrEqualTo(String value) {
            addCriterion("YHSJ_BAK <=", value, "yhsjBak");
            return (Criteria) this;
        }

        public Criteria andYhsjBakLike(String value) {
            addCriterion("YHSJ_BAK like", value, "yhsjBak");
            return (Criteria) this;
        }

        public Criteria andYhsjBakNotLike(String value) {
            addCriterion("YHSJ_BAK not like", value, "yhsjBak");
            return (Criteria) this;
        }

        public Criteria andYhsjBakIn(List<String> values) {
            addCriterion("YHSJ_BAK in", values, "yhsjBak");
            return (Criteria) this;
        }

        public Criteria andYhsjBakNotIn(List<String> values) {
            addCriterion("YHSJ_BAK not in", values, "yhsjBak");
            return (Criteria) this;
        }

        public Criteria andYhsjBakBetween(String value1, String value2) {
            addCriterion("YHSJ_BAK between", value1, value2, "yhsjBak");
            return (Criteria) this;
        }

        public Criteria andYhsjBakNotBetween(String value1, String value2) {
            addCriterion("YHSJ_BAK not between", value1, value2, "yhsjBak");
            return (Criteria) this;
        }

        public Criteria andBmbhBakIsNull() {
            addCriterion("BMBH_BAK is null");
            return (Criteria) this;
        }

        public Criteria andBmbhBakIsNotNull() {
            addCriterion("BMBH_BAK is not null");
            return (Criteria) this;
        }

        public Criteria andBmbhBakEqualTo(String value) {
            addCriterion("BMBH_BAK =", value, "bmbhBak");
            return (Criteria) this;
        }

        public Criteria andBmbhBakNotEqualTo(String value) {
            addCriterion("BMBH_BAK <>", value, "bmbhBak");
            return (Criteria) this;
        }

        public Criteria andBmbhBakGreaterThan(String value) {
            addCriterion("BMBH_BAK >", value, "bmbhBak");
            return (Criteria) this;
        }

        public Criteria andBmbhBakGreaterThanOrEqualTo(String value) {
            addCriterion("BMBH_BAK >=", value, "bmbhBak");
            return (Criteria) this;
        }

        public Criteria andBmbhBakLessThan(String value) {
            addCriterion("BMBH_BAK <", value, "bmbhBak");
            return (Criteria) this;
        }

        public Criteria andBmbhBakLessThanOrEqualTo(String value) {
            addCriterion("BMBH_BAK <=", value, "bmbhBak");
            return (Criteria) this;
        }

        public Criteria andBmbhBakLike(String value) {
            addCriterion("BMBH_BAK like", value, "bmbhBak");
            return (Criteria) this;
        }

        public Criteria andBmbhBakNotLike(String value) {
            addCriterion("BMBH_BAK not like", value, "bmbhBak");
            return (Criteria) this;
        }

        public Criteria andBmbhBakIn(List<String> values) {
            addCriterion("BMBH_BAK in", values, "bmbhBak");
            return (Criteria) this;
        }

        public Criteria andBmbhBakNotIn(List<String> values) {
            addCriterion("BMBH_BAK not in", values, "bmbhBak");
            return (Criteria) this;
        }

        public Criteria andBmbhBakBetween(String value1, String value2) {
            addCriterion("BMBH_BAK between", value1, value2, "bmbhBak");
            return (Criteria) this;
        }

        public Criteria andBmbhBakNotBetween(String value1, String value2) {
            addCriterion("BMBH_BAK not between", value1, value2, "bmbhBak");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNull() {
            addCriterion("CSRQ is null");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNotNull() {
            addCriterion("CSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andCsrqEqualTo(Date value) {
            addCriterionForJDBCDate("CSRQ =", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("CSRQ <>", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThan(Date value) {
            addCriterionForJDBCDate("CSRQ >", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CSRQ >=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThan(Date value) {
            addCriterionForJDBCDate("CSRQ <", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CSRQ <=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqIn(List<Date> values) {
            addCriterionForJDBCDate("CSRQ in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("CSRQ not in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CSRQ between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CSRQ not between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andSfdcIsNull() {
            addCriterion("SFDC is null");
            return (Criteria) this;
        }

        public Criteria andSfdcIsNotNull() {
            addCriterion("SFDC is not null");
            return (Criteria) this;
        }

        public Criteria andSfdcEqualTo(String value) {
            addCriterion("SFDC =", value, "sfdc");
            return (Criteria) this;
        }

        public Criteria andSfdcNotEqualTo(String value) {
            addCriterion("SFDC <>", value, "sfdc");
            return (Criteria) this;
        }

        public Criteria andSfdcGreaterThan(String value) {
            addCriterion("SFDC >", value, "sfdc");
            return (Criteria) this;
        }

        public Criteria andSfdcGreaterThanOrEqualTo(String value) {
            addCriterion("SFDC >=", value, "sfdc");
            return (Criteria) this;
        }

        public Criteria andSfdcLessThan(String value) {
            addCriterion("SFDC <", value, "sfdc");
            return (Criteria) this;
        }

        public Criteria andSfdcLessThanOrEqualTo(String value) {
            addCriterion("SFDC <=", value, "sfdc");
            return (Criteria) this;
        }

        public Criteria andSfdcLike(String value) {
            addCriterion("SFDC like", value, "sfdc");
            return (Criteria) this;
        }

        public Criteria andSfdcNotLike(String value) {
            addCriterion("SFDC not like", value, "sfdc");
            return (Criteria) this;
        }

        public Criteria andSfdcIn(List<String> values) {
            addCriterion("SFDC in", values, "sfdc");
            return (Criteria) this;
        }

        public Criteria andSfdcNotIn(List<String> values) {
            addCriterion("SFDC not in", values, "sfdc");
            return (Criteria) this;
        }

        public Criteria andSfdcBetween(String value1, String value2) {
            addCriterion("SFDC between", value1, value2, "sfdc");
            return (Criteria) this;
        }

        public Criteria andSfdcNotBetween(String value1, String value2) {
            addCriterion("SFDC not between", value1, value2, "sfdc");
            return (Criteria) this;
        }

        public Criteria andZfsjIsNull() {
            addCriterion("ZFSJ is null");
            return (Criteria) this;
        }

        public Criteria andZfsjIsNotNull() {
            addCriterion("ZFSJ is not null");
            return (Criteria) this;
        }

        public Criteria andZfsjEqualTo(String value) {
            addCriterion("ZFSJ =", value, "zfsj");
            return (Criteria) this;
        }

        public Criteria andZfsjNotEqualTo(String value) {
            addCriterion("ZFSJ <>", value, "zfsj");
            return (Criteria) this;
        }

        public Criteria andZfsjGreaterThan(String value) {
            addCriterion("ZFSJ >", value, "zfsj");
            return (Criteria) this;
        }

        public Criteria andZfsjGreaterThanOrEqualTo(String value) {
            addCriterion("ZFSJ >=", value, "zfsj");
            return (Criteria) this;
        }

        public Criteria andZfsjLessThan(String value) {
            addCriterion("ZFSJ <", value, "zfsj");
            return (Criteria) this;
        }

        public Criteria andZfsjLessThanOrEqualTo(String value) {
            addCriterion("ZFSJ <=", value, "zfsj");
            return (Criteria) this;
        }

        public Criteria andZfsjLike(String value) {
            addCriterion("ZFSJ like", value, "zfsj");
            return (Criteria) this;
        }

        public Criteria andZfsjNotLike(String value) {
            addCriterion("ZFSJ not like", value, "zfsj");
            return (Criteria) this;
        }

        public Criteria andZfsjIn(List<String> values) {
            addCriterion("ZFSJ in", values, "zfsj");
            return (Criteria) this;
        }

        public Criteria andZfsjNotIn(List<String> values) {
            addCriterion("ZFSJ not in", values, "zfsj");
            return (Criteria) this;
        }

        public Criteria andZfsjBetween(String value1, String value2) {
            addCriterion("ZFSJ between", value1, value2, "zfsj");
            return (Criteria) this;
        }

        public Criteria andZfsjNotBetween(String value1, String value2) {
            addCriterion("ZFSJ not between", value1, value2, "zfsj");
            return (Criteria) this;
        }

        public Criteria andSjdhIsNull() {
            addCriterion("SJDH is null");
            return (Criteria) this;
        }

        public Criteria andSjdhIsNotNull() {
            addCriterion("SJDH is not null");
            return (Criteria) this;
        }

        public Criteria andSjdhEqualTo(String value) {
            addCriterion("SJDH =", value, "sjdh");
            return (Criteria) this;
        }

        public Criteria andSjdhNotEqualTo(String value) {
            addCriterion("SJDH <>", value, "sjdh");
            return (Criteria) this;
        }

        public Criteria andSjdhGreaterThan(String value) {
            addCriterion("SJDH >", value, "sjdh");
            return (Criteria) this;
        }

        public Criteria andSjdhGreaterThanOrEqualTo(String value) {
            addCriterion("SJDH >=", value, "sjdh");
            return (Criteria) this;
        }

        public Criteria andSjdhLessThan(String value) {
            addCriterion("SJDH <", value, "sjdh");
            return (Criteria) this;
        }

        public Criteria andSjdhLessThanOrEqualTo(String value) {
            addCriterion("SJDH <=", value, "sjdh");
            return (Criteria) this;
        }

        public Criteria andSjdhLike(String value) {
            addCriterion("SJDH like", value, "sjdh");
            return (Criteria) this;
        }

        public Criteria andSjdhNotLike(String value) {
            addCriterion("SJDH not like", value, "sjdh");
            return (Criteria) this;
        }

        public Criteria andSjdhIn(List<String> values) {
            addCriterion("SJDH in", values, "sjdh");
            return (Criteria) this;
        }

        public Criteria andSjdhNotIn(List<String> values) {
            addCriterion("SJDH not in", values, "sjdh");
            return (Criteria) this;
        }

        public Criteria andSjdhBetween(String value1, String value2) {
            addCriterion("SJDH between", value1, value2, "sjdh");
            return (Criteria) this;
        }

        public Criteria andSjdhNotBetween(String value1, String value2) {
            addCriterion("SJDH not between", value1, value2, "sjdh");
            return (Criteria) this;
        }

        public Criteria andBgdhdhIsNull() {
            addCriterion("BGDHDH is null");
            return (Criteria) this;
        }

        public Criteria andBgdhdhIsNotNull() {
            addCriterion("BGDHDH is not null");
            return (Criteria) this;
        }

        public Criteria andBgdhdhEqualTo(String value) {
            addCriterion("BGDHDH =", value, "bgdhdh");
            return (Criteria) this;
        }

        public Criteria andBgdhdhNotEqualTo(String value) {
            addCriterion("BGDHDH <>", value, "bgdhdh");
            return (Criteria) this;
        }

        public Criteria andBgdhdhGreaterThan(String value) {
            addCriterion("BGDHDH >", value, "bgdhdh");
            return (Criteria) this;
        }

        public Criteria andBgdhdhGreaterThanOrEqualTo(String value) {
            addCriterion("BGDHDH >=", value, "bgdhdh");
            return (Criteria) this;
        }

        public Criteria andBgdhdhLessThan(String value) {
            addCriterion("BGDHDH <", value, "bgdhdh");
            return (Criteria) this;
        }

        public Criteria andBgdhdhLessThanOrEqualTo(String value) {
            addCriterion("BGDHDH <=", value, "bgdhdh");
            return (Criteria) this;
        }

        public Criteria andBgdhdhLike(String value) {
            addCriterion("BGDHDH like", value, "bgdhdh");
            return (Criteria) this;
        }

        public Criteria andBgdhdhNotLike(String value) {
            addCriterion("BGDHDH not like", value, "bgdhdh");
            return (Criteria) this;
        }

        public Criteria andBgdhdhIn(List<String> values) {
            addCriterion("BGDHDH in", values, "bgdhdh");
            return (Criteria) this;
        }

        public Criteria andBgdhdhNotIn(List<String> values) {
            addCriterion("BGDHDH not in", values, "bgdhdh");
            return (Criteria) this;
        }

        public Criteria andBgdhdhBetween(String value1, String value2) {
            addCriterion("BGDHDH between", value1, value2, "bgdhdh");
            return (Criteria) this;
        }

        public Criteria andBgdhdhNotBetween(String value1, String value2) {
            addCriterion("BGDHDH not between", value1, value2, "bgdhdh");
            return (Criteria) this;
        }

        public Criteria andZzdhIsNull() {
            addCriterion("ZZDH is null");
            return (Criteria) this;
        }

        public Criteria andZzdhIsNotNull() {
            addCriterion("ZZDH is not null");
            return (Criteria) this;
        }

        public Criteria andZzdhEqualTo(String value) {
            addCriterion("ZZDH =", value, "zzdh");
            return (Criteria) this;
        }

        public Criteria andZzdhNotEqualTo(String value) {
            addCriterion("ZZDH <>", value, "zzdh");
            return (Criteria) this;
        }

        public Criteria andZzdhGreaterThan(String value) {
            addCriterion("ZZDH >", value, "zzdh");
            return (Criteria) this;
        }

        public Criteria andZzdhGreaterThanOrEqualTo(String value) {
            addCriterion("ZZDH >=", value, "zzdh");
            return (Criteria) this;
        }

        public Criteria andZzdhLessThan(String value) {
            addCriterion("ZZDH <", value, "zzdh");
            return (Criteria) this;
        }

        public Criteria andZzdhLessThanOrEqualTo(String value) {
            addCriterion("ZZDH <=", value, "zzdh");
            return (Criteria) this;
        }

        public Criteria andZzdhLike(String value) {
            addCriterion("ZZDH like", value, "zzdh");
            return (Criteria) this;
        }

        public Criteria andZzdhNotLike(String value) {
            addCriterion("ZZDH not like", value, "zzdh");
            return (Criteria) this;
        }

        public Criteria andZzdhIn(List<String> values) {
            addCriterion("ZZDH in", values, "zzdh");
            return (Criteria) this;
        }

        public Criteria andZzdhNotIn(List<String> values) {
            addCriterion("ZZDH not in", values, "zzdh");
            return (Criteria) this;
        }

        public Criteria andZzdhBetween(String value1, String value2) {
            addCriterion("ZZDH between", value1, value2, "zzdh");
            return (Criteria) this;
        }

        public Criteria andZzdhNotBetween(String value1, String value2) {
            addCriterion("ZZDH not between", value1, value2, "zzdh");
            return (Criteria) this;
        }

        public Criteria andSfldIsNull() {
            addCriterion("SFLD is null");
            return (Criteria) this;
        }

        public Criteria andSfldIsNotNull() {
            addCriterion("SFLD is not null");
            return (Criteria) this;
        }

        public Criteria andSfldEqualTo(String value) {
            addCriterion("SFLD =", value, "sfld");
            return (Criteria) this;
        }

        public Criteria andSfldNotEqualTo(String value) {
            addCriterion("SFLD <>", value, "sfld");
            return (Criteria) this;
        }

        public Criteria andSfldGreaterThan(String value) {
            addCriterion("SFLD >", value, "sfld");
            return (Criteria) this;
        }

        public Criteria andSfldGreaterThanOrEqualTo(String value) {
            addCriterion("SFLD >=", value, "sfld");
            return (Criteria) this;
        }

        public Criteria andSfldLessThan(String value) {
            addCriterion("SFLD <", value, "sfld");
            return (Criteria) this;
        }

        public Criteria andSfldLessThanOrEqualTo(String value) {
            addCriterion("SFLD <=", value, "sfld");
            return (Criteria) this;
        }

        public Criteria andSfldLike(String value) {
            addCriterion("SFLD like", value, "sfld");
            return (Criteria) this;
        }

        public Criteria andSfldNotLike(String value) {
            addCriterion("SFLD not like", value, "sfld");
            return (Criteria) this;
        }

        public Criteria andSfldIn(List<String> values) {
            addCriterion("SFLD in", values, "sfld");
            return (Criteria) this;
        }

        public Criteria andSfldNotIn(List<String> values) {
            addCriterion("SFLD not in", values, "sfld");
            return (Criteria) this;
        }

        public Criteria andSfldBetween(String value1, String value2) {
            addCriterion("SFLD between", value1, value2, "sfld");
            return (Criteria) this;
        }

        public Criteria andSfldNotBetween(String value1, String value2) {
            addCriterion("SFLD not between", value1, value2, "sfld");
            return (Criteria) this;
        }

        public Criteria andBgdzIsNull() {
            addCriterion("BGDZ is null");
            return (Criteria) this;
        }

        public Criteria andBgdzIsNotNull() {
            addCriterion("BGDZ is not null");
            return (Criteria) this;
        }

        public Criteria andBgdzEqualTo(String value) {
            addCriterion("BGDZ =", value, "bgdz");
            return (Criteria) this;
        }

        public Criteria andBgdzNotEqualTo(String value) {
            addCriterion("BGDZ <>", value, "bgdz");
            return (Criteria) this;
        }

        public Criteria andBgdzGreaterThan(String value) {
            addCriterion("BGDZ >", value, "bgdz");
            return (Criteria) this;
        }

        public Criteria andBgdzGreaterThanOrEqualTo(String value) {
            addCriterion("BGDZ >=", value, "bgdz");
            return (Criteria) this;
        }

        public Criteria andBgdzLessThan(String value) {
            addCriterion("BGDZ <", value, "bgdz");
            return (Criteria) this;
        }

        public Criteria andBgdzLessThanOrEqualTo(String value) {
            addCriterion("BGDZ <=", value, "bgdz");
            return (Criteria) this;
        }

        public Criteria andBgdzLike(String value) {
            addCriterion("BGDZ like", value, "bgdz");
            return (Criteria) this;
        }

        public Criteria andBgdzNotLike(String value) {
            addCriterion("BGDZ not like", value, "bgdz");
            return (Criteria) this;
        }

        public Criteria andBgdzIn(List<String> values) {
            addCriterion("BGDZ in", values, "bgdz");
            return (Criteria) this;
        }

        public Criteria andBgdzNotIn(List<String> values) {
            addCriterion("BGDZ not in", values, "bgdz");
            return (Criteria) this;
        }

        public Criteria andBgdzBetween(String value1, String value2) {
            addCriterion("BGDZ between", value1, value2, "bgdz");
            return (Criteria) this;
        }

        public Criteria andBgdzNotBetween(String value1, String value2) {
            addCriterion("BGDZ not between", value1, value2, "bgdz");
            return (Criteria) this;
        }

        public Criteria andZhdlsjIsNull() {
            addCriterion("ZHDLSJ is null");
            return (Criteria) this;
        }

        public Criteria andZhdlsjIsNotNull() {
            addCriterion("ZHDLSJ is not null");
            return (Criteria) this;
        }

        public Criteria andZhdlsjEqualTo(Date value) {
            addCriterionForJDBCDate("ZHDLSJ =", value, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("ZHDLSJ <>", value, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjGreaterThan(Date value) {
            addCriterionForJDBCDate("ZHDLSJ >", value, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ZHDLSJ >=", value, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjLessThan(Date value) {
            addCriterionForJDBCDate("ZHDLSJ <", value, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ZHDLSJ <=", value, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjIn(List<Date> values) {
            addCriterionForJDBCDate("ZHDLSJ in", values, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("ZHDLSJ not in", values, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ZHDLSJ between", value1, value2, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ZHDLSJ not between", value1, value2, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andYhdhIsNull() {
            addCriterion("YHDH is null");
            return (Criteria) this;
        }

        public Criteria andYhdhIsNotNull() {
            addCriterion("YHDH is not null");
            return (Criteria) this;
        }

        public Criteria andYhdhEqualTo(String value) {
            addCriterion("YHDH =", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhNotEqualTo(String value) {
            addCriterion("YHDH <>", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhGreaterThan(String value) {
            addCriterion("YHDH >", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhGreaterThanOrEqualTo(String value) {
            addCriterion("YHDH >=", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhLessThan(String value) {
            addCriterion("YHDH <", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhLessThanOrEqualTo(String value) {
            addCriterion("YHDH <=", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhLike(String value) {
            addCriterion("YHDH like", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhNotLike(String value) {
            addCriterion("YHDH not like", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhIn(List<String> values) {
            addCriterion("YHDH in", values, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhNotIn(List<String> values) {
            addCriterion("YHDH not in", values, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhBetween(String value1, String value2) {
            addCriterion("YHDH between", value1, value2, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhNotBetween(String value1, String value2) {
            addCriterion("YHDH not between", value1, value2, "yhdh");
            return (Criteria) this;
        }

        public Criteria andSfwtrwIsNull() {
            addCriterion("SFWTRW is null");
            return (Criteria) this;
        }

        public Criteria andSfwtrwIsNotNull() {
            addCriterion("SFWTRW is not null");
            return (Criteria) this;
        }

        public Criteria andSfwtrwEqualTo(String value) {
            addCriterion("SFWTRW =", value, "sfwtrw");
            return (Criteria) this;
        }

        public Criteria andSfwtrwNotEqualTo(String value) {
            addCriterion("SFWTRW <>", value, "sfwtrw");
            return (Criteria) this;
        }

        public Criteria andSfwtrwGreaterThan(String value) {
            addCriterion("SFWTRW >", value, "sfwtrw");
            return (Criteria) this;
        }

        public Criteria andSfwtrwGreaterThanOrEqualTo(String value) {
            addCriterion("SFWTRW >=", value, "sfwtrw");
            return (Criteria) this;
        }

        public Criteria andSfwtrwLessThan(String value) {
            addCriterion("SFWTRW <", value, "sfwtrw");
            return (Criteria) this;
        }

        public Criteria andSfwtrwLessThanOrEqualTo(String value) {
            addCriterion("SFWTRW <=", value, "sfwtrw");
            return (Criteria) this;
        }

        public Criteria andSfwtrwLike(String value) {
            addCriterion("SFWTRW like", value, "sfwtrw");
            return (Criteria) this;
        }

        public Criteria andSfwtrwNotLike(String value) {
            addCriterion("SFWTRW not like", value, "sfwtrw");
            return (Criteria) this;
        }

        public Criteria andSfwtrwIn(List<String> values) {
            addCriterion("SFWTRW in", values, "sfwtrw");
            return (Criteria) this;
        }

        public Criteria andSfwtrwNotIn(List<String> values) {
            addCriterion("SFWTRW not in", values, "sfwtrw");
            return (Criteria) this;
        }

        public Criteria andSfwtrwBetween(String value1, String value2) {
            addCriterion("SFWTRW between", value1, value2, "sfwtrw");
            return (Criteria) this;
        }

        public Criteria andSfwtrwNotBetween(String value1, String value2) {
            addCriterion("SFWTRW not between", value1, value2, "sfwtrw");
            return (Criteria) this;
        }

        public Criteria andSqkssjIsNull() {
            addCriterion("SQKSSJ is null");
            return (Criteria) this;
        }

        public Criteria andSqkssjIsNotNull() {
            addCriterion("SQKSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andSqkssjEqualTo(Date value) {
            addCriterionForJDBCDate("SQKSSJ =", value, "sqkssj");
            return (Criteria) this;
        }

        public Criteria andSqkssjNotEqualTo(Date value) {
            addCriterionForJDBCDate("SQKSSJ <>", value, "sqkssj");
            return (Criteria) this;
        }

        public Criteria andSqkssjGreaterThan(Date value) {
            addCriterionForJDBCDate("SQKSSJ >", value, "sqkssj");
            return (Criteria) this;
        }

        public Criteria andSqkssjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SQKSSJ >=", value, "sqkssj");
            return (Criteria) this;
        }

        public Criteria andSqkssjLessThan(Date value) {
            addCriterionForJDBCDate("SQKSSJ <", value, "sqkssj");
            return (Criteria) this;
        }

        public Criteria andSqkssjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SQKSSJ <=", value, "sqkssj");
            return (Criteria) this;
        }

        public Criteria andSqkssjIn(List<Date> values) {
            addCriterionForJDBCDate("SQKSSJ in", values, "sqkssj");
            return (Criteria) this;
        }

        public Criteria andSqkssjNotIn(List<Date> values) {
            addCriterionForJDBCDate("SQKSSJ not in", values, "sqkssj");
            return (Criteria) this;
        }

        public Criteria andSqkssjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SQKSSJ between", value1, value2, "sqkssj");
            return (Criteria) this;
        }

        public Criteria andSqkssjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SQKSSJ not between", value1, value2, "sqkssj");
            return (Criteria) this;
        }

        public Criteria andSqjzsjIsNull() {
            addCriterion("SQJZSJ is null");
            return (Criteria) this;
        }

        public Criteria andSqjzsjIsNotNull() {
            addCriterion("SQJZSJ is not null");
            return (Criteria) this;
        }

        public Criteria andSqjzsjEqualTo(Date value) {
            addCriterionForJDBCDate("SQJZSJ =", value, "sqjzsj");
            return (Criteria) this;
        }

        public Criteria andSqjzsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("SQJZSJ <>", value, "sqjzsj");
            return (Criteria) this;
        }

        public Criteria andSqjzsjGreaterThan(Date value) {
            addCriterionForJDBCDate("SQJZSJ >", value, "sqjzsj");
            return (Criteria) this;
        }

        public Criteria andSqjzsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SQJZSJ >=", value, "sqjzsj");
            return (Criteria) this;
        }

        public Criteria andSqjzsjLessThan(Date value) {
            addCriterionForJDBCDate("SQJZSJ <", value, "sqjzsj");
            return (Criteria) this;
        }

        public Criteria andSqjzsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SQJZSJ <=", value, "sqjzsj");
            return (Criteria) this;
        }

        public Criteria andSqjzsjIn(List<Date> values) {
            addCriterionForJDBCDate("SQJZSJ in", values, "sqjzsj");
            return (Criteria) this;
        }

        public Criteria andSqjzsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("SQJZSJ not in", values, "sqjzsj");
            return (Criteria) this;
        }

        public Criteria andSqjzsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SQJZSJ between", value1, value2, "sqjzsj");
            return (Criteria) this;
        }

        public Criteria andSqjzsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SQJZSJ not between", value1, value2, "sqjzsj");
            return (Criteria) this;
        }

        public Criteria andFontstyleIsNull() {
            addCriterion("FONTSTYLE is null");
            return (Criteria) this;
        }

        public Criteria andFontstyleIsNotNull() {
            addCriterion("FONTSTYLE is not null");
            return (Criteria) this;
        }

        public Criteria andFontstyleEqualTo(String value) {
            addCriterion("FONTSTYLE =", value, "fontstyle");
            return (Criteria) this;
        }

        public Criteria andFontstyleNotEqualTo(String value) {
            addCriterion("FONTSTYLE <>", value, "fontstyle");
            return (Criteria) this;
        }

        public Criteria andFontstyleGreaterThan(String value) {
            addCriterion("FONTSTYLE >", value, "fontstyle");
            return (Criteria) this;
        }

        public Criteria andFontstyleGreaterThanOrEqualTo(String value) {
            addCriterion("FONTSTYLE >=", value, "fontstyle");
            return (Criteria) this;
        }

        public Criteria andFontstyleLessThan(String value) {
            addCriterion("FONTSTYLE <", value, "fontstyle");
            return (Criteria) this;
        }

        public Criteria andFontstyleLessThanOrEqualTo(String value) {
            addCriterion("FONTSTYLE <=", value, "fontstyle");
            return (Criteria) this;
        }

        public Criteria andFontstyleLike(String value) {
            addCriterion("FONTSTYLE like", value, "fontstyle");
            return (Criteria) this;
        }

        public Criteria andFontstyleNotLike(String value) {
            addCriterion("FONTSTYLE not like", value, "fontstyle");
            return (Criteria) this;
        }

        public Criteria andFontstyleIn(List<String> values) {
            addCriterion("FONTSTYLE in", values, "fontstyle");
            return (Criteria) this;
        }

        public Criteria andFontstyleNotIn(List<String> values) {
            addCriterion("FONTSTYLE not in", values, "fontstyle");
            return (Criteria) this;
        }

        public Criteria andFontstyleBetween(String value1, String value2) {
            addCriterion("FONTSTYLE between", value1, value2, "fontstyle");
            return (Criteria) this;
        }

        public Criteria andFontstyleNotBetween(String value1, String value2) {
            addCriterion("FONTSTYLE not between", value1, value2, "fontstyle");
            return (Criteria) this;
        }

        public Criteria andCwcsIsNull() {
            addCriterion("CWCS is null");
            return (Criteria) this;
        }

        public Criteria andCwcsIsNotNull() {
            addCriterion("CWCS is not null");
            return (Criteria) this;
        }

        public Criteria andCwcsEqualTo(BigDecimal value) {
            addCriterion("CWCS =", value, "cwcs");
            return (Criteria) this;
        }

        public Criteria andCwcsNotEqualTo(BigDecimal value) {
            addCriterion("CWCS <>", value, "cwcs");
            return (Criteria) this;
        }

        public Criteria andCwcsGreaterThan(BigDecimal value) {
            addCriterion("CWCS >", value, "cwcs");
            return (Criteria) this;
        }

        public Criteria andCwcsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CWCS >=", value, "cwcs");
            return (Criteria) this;
        }

        public Criteria andCwcsLessThan(BigDecimal value) {
            addCriterion("CWCS <", value, "cwcs");
            return (Criteria) this;
        }

        public Criteria andCwcsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CWCS <=", value, "cwcs");
            return (Criteria) this;
        }

        public Criteria andCwcsIn(List<BigDecimal> values) {
            addCriterion("CWCS in", values, "cwcs");
            return (Criteria) this;
        }

        public Criteria andCwcsNotIn(List<BigDecimal> values) {
            addCriterion("CWCS not in", values, "cwcs");
            return (Criteria) this;
        }

        public Criteria andCwcsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CWCS between", value1, value2, "cwcs");
            return (Criteria) this;
        }

        public Criteria andCwcsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CWCS not between", value1, value2, "cwcs");
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