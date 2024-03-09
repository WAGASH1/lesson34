package com.techacademy.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techacademy.entity.Employee;
import com.techacademy.entity.Report;

public interface ReportRepository extends JpaRepository<Report, String> {
    // 日付を使用して日報を検索
    Report findByReportDate(LocalDate reportDate);

    // 従業員に基づいて日報を取得
    List<Report> findByEmployee(Employee employee);

    // 日付と従業員に基づいて日報を取得
    Report findByEmployeeDate(LocalDate reportDate, Employee employee);
}
