package com.example.comic.service;

import com.example.comic.model.dto.PageDetailResponse;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "application.storage.minio.enabled", havingValue = "false", matchIfMissing = true)
public class NoCachePageService implements PageCacheService {

    @Override
    public PageDetailResponse getPageDetailCached(Long pageId, String lang) {
        return null;
    }
}