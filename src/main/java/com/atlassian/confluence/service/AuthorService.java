package com.atlassian.confluence.service;

import com.atlassian.confluence.ao.Author;
import com.atlassian.confluence.model.AuthorModel;

public interface AuthorService {
    AuthorModel[] getAuthors();
}