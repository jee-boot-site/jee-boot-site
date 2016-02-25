package com.boot.cms.entity;

import javax.persistence.*;

@Table(name = "cms_article_data")
public class ArticleData {
    /**
     * 编号
     */
    @Id
    private String id;

    /**
     * 文章来源
     */
    private String copyfrom;

    /**
     * 相关文章
     */
    private String relation;

    /**
     * 是否允许评论
     */
    @Column(name = "allow_comment")
    private String allowComment;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取文章来源
     *
     * @return copyfrom - 文章来源
     */
    public String getCopyfrom() {
        return copyfrom;
    }

    /**
     * 设置文章来源
     *
     * @param copyfrom 文章来源
     */
    public void setCopyfrom(String copyfrom) {
        this.copyfrom = copyfrom == null ? null : copyfrom.trim();
    }

    /**
     * 获取相关文章
     *
     * @return relation - 相关文章
     */
    public String getRelation() {
        return relation;
    }

    /**
     * 设置相关文章
     *
     * @param relation 相关文章
     */
    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    /**
     * 获取是否允许评论
     *
     * @return allow_comment - 是否允许评论
     */
    public String getAllowComment() {
        return allowComment;
    }

    /**
     * 设置是否允许评论
     *
     * @param allowComment 是否允许评论
     */
    public void setAllowComment(String allowComment) {
        this.allowComment = allowComment == null ? null : allowComment.trim();
    }

    /**
     * 获取文章内容
     *
     * @return content - 文章内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置文章内容
     *
     * @param content 文章内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}