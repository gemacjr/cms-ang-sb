package com.swiftbeard.cms.models;



import java.util.HashSet;
import java.util.Set;


public class News {

    private String id;

    private String title;

    private String content;

    private User author;

    private Set<User> mandatoryReviewers = new HashSet<>();

    private Set<Review> reviewers = new HashSet<>();

    private Set<Category> categories = new HashSet<>();

    private Set<Tag> tags = new HashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Set<User> getMandatoryReviewers() {
        return mandatoryReviewers;
    }

    public void setMandatoryReviewers(Set<User> mandatoryReviewers) {
        this.mandatoryReviewers = mandatoryReviewers;
    }

    public Set<Review> getReviewers() {
        return reviewers;
    }

    public void setReviewers(Set<Review> reviewers) {
        this.reviewers = reviewers;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public Boolean revised() {
        return this.mandatoryReviewers.stream().allMatch(reviewer -> this.reviewers.stream()
                .anyMatch(review -> reviewer.getId().equals(review.getUserId()) && "approved".equals(review.getStatus())));
    }

    public Review review(String userId,String status){
        final Review review = new Review(userId,status);
        this.reviewers.add(review);
        return review;
    }

}
