package com.example.soapserver.data.repository

import com.example.soapserver.data.entity.LocationEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface LocationRepository: JpaRepository<LocationEntity, UUID> {
}