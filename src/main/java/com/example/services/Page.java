package com.example.services;
import java.util.List;

public class Page {
    int maxPage;
    int pageSize;
    List<Worker> workers;
    int numberOfPages;

    public Page(int maxPage, int pageSize, List<Worker> workers, int numberOfPages) {
        this.maxPage = maxPage;
        this.pageSize = pageSize;
        this.workers = workers;
        this.numberOfPages = numberOfPages;
    }

    public int getMaxPage() {
        return maxPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
