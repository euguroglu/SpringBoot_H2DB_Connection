package com.springboot.fundamentals.service;

import com.springboot.fundamentals.entity.Release;

public interface ReleaseService {
    Iterable<Release> listReleases();
}

