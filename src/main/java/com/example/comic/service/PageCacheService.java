package com.example.comic.service;

import com.example.comic.model.dto.PageDetailResponse;

public interface PageCacheService {
    PageDetailResponse getPageDetailCached(Long pageId, String lang);
}