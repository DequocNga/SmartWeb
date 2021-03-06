package com.itsol.websmart.model;
// Generated Feb 28, 2019 10:23:30 AM by Hibernate Tools 3.5.0.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblNews generated by hbm2java
 */
@Entity
@Table(name = "tbl_news", catalog = "smart_web")
public class TblNews implements java.io.Serializable {

	private TblNewsId id;
	private TblCategory tblCategory;
	private TblUser tblUser;
	private String newsAvatar;
	private String newsTitle;
	private Date newsPostDay;
	private String newsContent;
	private Integer newsUserId;
	private Integer tblUserTblProfileId;

	public TblNews() {
	}

	public TblNews(TblNewsId id, TblCategory tblCategory) {
		this.id = id;
		this.tblCategory = tblCategory;
	}

	public TblNews(TblNewsId id, TblCategory tblCategory, TblUser tblUser, String newsAvatar, String newsTitle,
			Date newsPostDay, String newsContent, Integer newsUserId, Integer tblUserTblProfileId) {
		this.id = id;
		this.tblCategory = tblCategory;
		this.tblUser = tblUser;
		this.newsAvatar = newsAvatar;
		this.newsTitle = newsTitle;
		this.newsPostDay = newsPostDay;
		this.newsContent = newsContent;
		this.newsUserId = newsUserId;
		this.tblUserTblProfileId = tblUserTblProfileId;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "newsId", column = @Column(name = "news_id", nullable = false)),
			@AttributeOverride(name = "tblCategoriesId", column = @Column(name = "tbl_categories_id", nullable = false)) })
	public TblNewsId getId() {
		return this.id;
	}

	public void setId(TblNewsId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tbl_categories_id", nullable = false, insertable = false, updatable = false)
	public TblCategory getTblCategory() {
		return this.tblCategory;
	}

	public void setTblCategory(TblCategory tblCategory) {
		this.tblCategory = tblCategory;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tbl_user_id")
	public TblUser getTblUser() {
		return this.tblUser;
	}

	public void setTblUser(TblUser tblUser) {
		this.tblUser = tblUser;
	}

	@Column(name = "news_avatar", length = 65535)
	public String getNewsAvatar() {
		return this.newsAvatar;
	}

	public void setNewsAvatar(String newsAvatar) {
		this.newsAvatar = newsAvatar;
	}

	@Column(name = "news_title", length = 45)
	public String getNewsTitle() {
		return this.newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "news_post_day", length = 10)
	public Date getNewsPostDay() {
		return this.newsPostDay;
	}

	public void setNewsPostDay(Date newsPostDay) {
		this.newsPostDay = newsPostDay;
	}

	@Column(name = "news_content", length = 65535)
	public String getNewsContent() {
		return this.newsContent;
	}

	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}

	@Column(name = "news_user_id")
	public Integer getNewsUserId() {
		return this.newsUserId;
	}

	public void setNewsUserId(Integer newsUserId) {
		this.newsUserId = newsUserId;
	}

	@Column(name = "tbl_user_tbl_profile_id")
	public Integer getTblUserTblProfileId() {
		return this.tblUserTblProfileId;
	}

	public void setTblUserTblProfileId(Integer tblUserTblProfileId) {
		this.tblUserTblProfileId = tblUserTblProfileId;
	}

}
