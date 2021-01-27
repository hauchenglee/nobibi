package com.nobibi.nobibicore.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * TODO: 加git api
 * 类别
 * 查看commit的file有多少被修改，与需求单关联
 */
@Entity
@Table(name = "requestment")
@Data
public class Requestment {
    
    @Id
    private String requestment_id;

    @Column(nullable = false)
    @NotNull
    private String requestment_code; // 需求号码

    @Column(nullable = false)
    @NotNull
    private String requestment_title; // 标题

    @Column(nullable = false)
    @NotNull
    private String requestment_content; // 内容

    @Column(nullable = false)
    @NotNull
    private Date requestment_create_date; // 建立日期

    @Column(nullable = false)
    @NotNull
    private Date requestment_update_date; // 最后修改日期

    @Column(nullable = false)
    @NotNull
    private Date requestment_estimate_date; // 预计完成日期

    @Column(nullable = false)
    @NotNull
    private Date requestment_compelete_date; // 完成日期

    @Column(nullable = false)
    @NotNull
    private String requestment_category; // 类别？以啥分类？功能业务分类？还是动作例如bug、fix等

    @Column(nullable = false)
    @NotNull
    // 规划中 开发中 测试中 已上线 需求暂停 取消
    private String requestment_status; // 状态

    @Column(nullable = false)
    @NotNull
    private String requestment_priority; // 优先级

    @Column(nullable = false)
    @NotNull
    private String requestment_remark; // 备注

    @Column(nullable = false)
    @NotNull
//    @OneToOne
    private String requestment_creator; // 建立者

    @Column(nullable = false)
    @NotNull
//    @OneToOne
    private String requestment_executor; // 负责人

    @Column(nullable = false)
    @NotNull
    @OneToMany
    private List<User> requestment_collaborator; // 谢作者

    @Column(nullable = false)
    @NotNull
    @OneToMany
    private List<History> requestment_history; // 修改记录

    @OneToMany
    private List<AppFile> appFileList; // 附件
}
