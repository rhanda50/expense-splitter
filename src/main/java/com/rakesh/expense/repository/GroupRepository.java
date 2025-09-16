package com.rakesh.expense.repository;

import com.rakesh.expense.model.GroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<GroupEntity, Long> { }