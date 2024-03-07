package com.techacademy.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techacademy.entity.Report;

public interface ReportRepository extends JpaRepository<Report, String> {
    // 日付を使用して日報を検索
    Report findByReportDate(LocalDate reportDate);
}