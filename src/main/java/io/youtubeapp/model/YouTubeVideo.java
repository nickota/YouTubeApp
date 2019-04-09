package io.youtubeapp.model;

import java.math.BigInteger;
import java.time.LocalDate;

import io.youtubeapp.service.com.util.DateUtil;

public class YouTubeVideo {

	//Resource representation
	//https://developers.google.com/youtube/v3/docs/videos?hl=en#resource
	private String title;
	private String url;
	private String thumbnailUrl;
	private LocalDate publishDate;
	private String description;
	private String channelTitle;
	private BigInteger viewCount;

	//return "~years ago" or "~months ago"
	public String getElapsedTime() {
		return DateUtil.getElapsedTime(publishDate);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getThumbnailUrl() {
		return thumbnailUrl;
	}
	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigInteger getViewCount() {
		return viewCount;
	}
	public void setViewCount(BigInteger viewCount) {
		this.viewCount = viewCount;
	}
	public String getChannelTitle() {
		return channelTitle;
	}
	public void setChannelTitle(String channelTitle) {
		this.channelTitle = channelTitle;
	}

}
