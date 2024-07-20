package com.ims.server.itemSummary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemSummaryRepository extends JpaRepository<ItemSummary, Long> {
}
