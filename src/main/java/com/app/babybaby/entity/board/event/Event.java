package com.app.babybaby.entity.board.event;

import com.app.babybaby.entity.board.BoardInfo;
import com.app.babybaby.entity.calendar.Calendar;
import com.app.babybaby.entity.embeddable.Address;
import com.app.babybaby.entity.user.User;
import com.app.babybaby.type.CategoryType;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@ToString(callSuper = true, exclude = {"company"})
@Table(name = "TBL_EVENT")
@PrimaryKeyJoinColumn(name = "ID")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Event extends BoardInfo {

    @NotNull
    private Long eventRecruitCount;

    @NotNull
    @Embedded
    private Address eventLocation;

    @NotNull
    private Long eventPrice;

    @NotNull
    private String eventTitle;

    @NotNull
    private String eventContent;

    @NotNull
    @Enumerated(EnumType.STRING)
    private CategoryType category;

    @OneToOne
    private Calendar calendar;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_ID")
    private User company;

    public Event(Long eventRecruitCount, Address eventLocation, Long eventPrice, String eventTitle, String eventContent, CategoryType category, Calendar calendar, User company) {
        this.eventRecruitCount = eventRecruitCount;
        this.eventLocation = eventLocation;
        this.eventPrice = eventPrice;
        this.eventTitle = eventTitle;
        this.eventContent = eventContent;
        this.category = category;
        this.calendar = calendar;
        this.company = company;
    }

    public Event(String boardTitle, String boardContent, Long eventRecruitCount, Address eventLocation, Long eventPrice, String eventTitle, String eventContent, CategoryType category, Calendar calendar, User company) {
        super(boardTitle, boardContent);
        this.eventRecruitCount = eventRecruitCount;
        this.eventLocation = eventLocation;
        this.eventPrice = eventPrice;
        this.eventTitle = eventTitle;
        this.eventContent = eventContent;
        this.category = category;
        this.calendar = calendar;
        this.company = company;
    }
}
