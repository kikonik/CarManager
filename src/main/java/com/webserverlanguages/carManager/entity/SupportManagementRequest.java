package com.webserverlanguages.carManager.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "support_management_request")
public class SupportManagementRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;

    @OneToOne
    @JoinColumn(name = "car_id")
    private Car carId;

    @OneToOne
    @JoinColumn(name = "garage_id")
    private Garage garageId;

    private String serviceType;

    private LocalDateTime scheduleDate;

}


