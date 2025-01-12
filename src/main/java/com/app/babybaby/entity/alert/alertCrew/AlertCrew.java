package com.app.babybaby.entity.alert.alertCrew;

import com.app.babybaby.entity.alert.Alert;
import com.app.babybaby.entity.user.Crew;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@ToString(callSuper = true, exclude = {"crew"})
@Table(name = "TBL_ALERT_CREW")
@PrimaryKeyJoinColumn(name = "ID")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AlertCrew extends Alert {
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CREW_ID")
    private Crew crew;

    public AlertCrew(Crew crew) {
        super();
        this.crew = crew;
    }
}
