package com.app.babybaby.entity.reply;

import com.app.babybaby.entity.audit.Period;
import com.app.babybaby.entity.board.parentsBoard.ParentsBoard;
import com.app.babybaby.entity.user.User;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@ToString(exclude = {"user", "parentsBoard"})
@Table(name = "TBL_PARENTS_BOARD_REPLY")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ParentsBoardReply extends Period {
    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private Long id;
    @NotNull
    private String ParentsBoardReplyContent;

    @ManyToOne(fetch = FetchType.LAZY)
    private ParentsBoard parentsBoard;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    public ParentsBoardReply(String parentsBoardReplyContent, ParentsBoard parentsBoard, User user) {
        ParentsBoardReplyContent = parentsBoardReplyContent;
        this.parentsBoard = parentsBoard;
        this.user = user;
    }
}
