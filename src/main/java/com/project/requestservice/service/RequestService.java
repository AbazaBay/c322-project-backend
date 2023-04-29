package com.project.requestservice.service;

import com.project.requestservice.model.Request;

import java.util.List;

public interface RequestService {
    public Request saveRequest(Request request);
    public List<Request> getAllStudents();
}
