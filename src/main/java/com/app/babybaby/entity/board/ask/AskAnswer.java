package com.app.babybaby.entity.board.ask;

import com.app.babybaby.entity.board.BoardInfo;
import com.app.babybaby.entity.board.ask.Ask;
import com.app.babybaby.entity.user.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@ToString(callSuper = true, exclude = {"ask", "admin"})
@Table(name = "TBL_ASK_ANSWER")
@PrimaryKeyJoinColumn(name = "ID")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AskAnswer extends BoardInfo {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ASK_ID")
    private Ask ask;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ADMIN_ID")
    private User admin;

    public AskAnswer(Ask ask) {
        this.ask = ask;
    }

    public AskAnswer(String boardTitle, String boardContent, Ask ask) {
        super(boardTitle, boardContent);
        this.ask = ask;
    }
}
