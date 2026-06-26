package com.example.comic.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChapterPageResponse {
    private Long id;
    private Integer pageNumber;
    private String imageUrl;
    private String cleanedImageUrl;
    private String originalMetadataUrl;
}
