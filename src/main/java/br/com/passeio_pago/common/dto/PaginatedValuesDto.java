package br.com.passeio_pago.common.dto;

import java.io.Serializable;
import java.util.Collection;

public class PaginatedValuesDto<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2841112559866520763L;
	private Collection<T> values;
	private int pageNum;
	private int pageSize;
	private boolean hasMore;

	public PaginatedValuesDto() {
		// Intentionally empty.
	}

	public PaginatedValuesDto(Collection<T> values, int pageNum, int maxResults, boolean hasMore) {
		this.values = values;
		this.pageNum = pageNum;
		this.pageSize = maxResults;
		this.hasMore = hasMore;
	}

	public int getPageNum() {
		return pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public boolean isHasMore() {
		return hasMore;
	}

	public void setHasMore(boolean hasMore) {
		this.hasMore = hasMore;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public Collection<T> getValues() {
		return values;
	}
}
