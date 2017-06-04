package com.kq.admin.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单表(出车单)
 */
public class PcOrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	// 主键Id
	private Long id;
	// 车主即user_id
	private String openId;
	// 司机姓名
	private String name;
	// 联系电话
	private String mobile;
	// 出发时间
	private String goTime;
	// 出发地点
	private String startAddr;
	// 到达地
	private String endAddr;
	// 途经
	private String memo;
	// 车牌号
	private String plates;
	// 拼车人数
	private Integer reqNum;
	// 车费单价
	private BigDecimal price;
	// 剩余座位
	private Integer surplusSeat;
	// 订单状态（0：发布中，1：已满，2：已送达，3：已取消）
	private String status;
	// 完成订单时所得积分
	private BigDecimal score;
	// 创建时间
	private Date createTime;
	//
	private String createBy;
	//
	private Integer version;
	//
	private Date updateTime;
	//
	private String updateBy;

	/**
	 * 设置：主键Id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取：主键Id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 设置：车主即user_id
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	/**
	 * 获取：车主即user_id
	 */
	public String getOpenId() {
		return openId;
	}

	/**
	 * 设置：司机姓名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取：司机姓名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置：联系电话
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * 获取：联系电话
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * 设置：出发时间
	 */
	public void setGoTime(String goTime) {
		this.goTime = goTime;
	}

	/**
	 * 获取：出发时间
	 */
	public String getGoTime() {
		return goTime;
	}

	/**
	 * 设置：出发地点
	 */
	public void setStartAddr(String startAddr) {
		this.startAddr = startAddr;
	}

	/**
	 * 获取：出发地点
	 */
	public String getStartAddr() {
		return startAddr;
	}

	/**
	 * 设置：到达地
	 */
	public void setEndAddr(String endAddr) {
		this.endAddr = endAddr;
	}

	/**
	 * 获取：到达地
	 */
	public String getEndAddr() {
		return endAddr;
	}

	/**
	 * 设置：途经
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * 获取：途经
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * 设置：车牌号
	 */
	public void setPlates(String plates) {
		this.plates = plates;
	}

	/**
	 * 获取：车牌号
	 */
	public String getPlates() {
		return plates;
	}

	/**
	 * 设置：拼车人数
	 */
	public void setReqNum(Integer reqNum) {
		this.reqNum = reqNum;
	}

	/**
	 * 获取：拼车人数
	 */
	public Integer getReqNum() {
		return reqNum;
	}

	/**
	 * 设置：车费单价
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * 获取：车费单价
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * 设置：剩余座位
	 */
	public void setSurplusSeat(Integer surplusSeat) {
		this.surplusSeat = surplusSeat;
	}

	/**
	 * 获取：剩余座位
	 */
	public Integer getSurplusSeat() {
		return surplusSeat;
	}

	/**
	 * 设置：订单状态（0：发布中，1：已满，2：已送达，3：已取消）
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 获取：订单状态（0：发布中，1：已满，2：已送达，3：已取消）
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 设置：完成订单时所得积分
	 */
	public void setScore(BigDecimal score) {
		this.score = score;
	}

	/**
	 * 获取：完成订单时所得积分
	 */
	public BigDecimal getScore() {
		return score;
	}

	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置：
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	/**
	 * 获取：
	 */
	public String getCreateBy() {
		return createBy;
	}

	/**
	 * 设置：
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * 获取：
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 * 设置：
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 获取：
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * 设置：
	 */
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	/**
	 * 获取：
	 */
	public String getUpdateBy() {
		return updateBy;
	}
}
