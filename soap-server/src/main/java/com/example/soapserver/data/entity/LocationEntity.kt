package com.example.soapserver.data.entity

import com.example.soapserver.utils.UUID_ZERO
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.GenericGenerator
import java.util.UUID

@Entity
@Table(name = "locations")
class LocationEntity(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator",
    )
    @Column(name = "id", updatable = false, nullable = false)
    val id: UUID = UUID_ZERO,

    @Column(name = "name")
    val name: String = "",

    @Column(name = "description")
    val description: String = "",

    @Column(name = "treasure_chest_amount")
    val treasureChestAmount: Long = 0,
)