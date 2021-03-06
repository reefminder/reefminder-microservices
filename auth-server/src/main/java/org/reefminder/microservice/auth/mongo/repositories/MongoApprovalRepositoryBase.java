package org.reefminder.microservice.auth.mongo.repositories;

import org.reefminder.microservice.auth.mongo.domain.MongoApproval;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

public interface MongoApprovalRepositoryBase {
    boolean updateOrCreate(Collection<MongoApproval> mongoApprovals);

    boolean updateExpiresAt(LocalDate now, MongoApproval mongoApproval);

    boolean deleteByUserIdAndClientIdAndScope(MongoApproval mongoApproval);

    List<MongoApproval> findByUserIdAndClientId(String userId, String clientId);
}
