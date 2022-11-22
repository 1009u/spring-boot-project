package com.January.repository;

import com.January.model.HardDisk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HardDiskJpaRepository extends JpaRepository<HardDisk,Long > {
}
