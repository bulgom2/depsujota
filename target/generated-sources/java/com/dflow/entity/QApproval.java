package com.dflow.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QApproval is a Querydsl query type for Approval
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QApproval extends EntityPathBase<Approval> {

    private static final long serialVersionUID = -62475003L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QApproval approval = new QApproval("approval");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath aprvCheck = createString("aprvCheck");

    public final NumberPath<Long> aprvMemberNo = createNumber("aprvMemberNo", Long.class);

    public final NumberPath<Long> aprvNo = createNumber("aprvNo", Long.class);

    public final StringPath aprvOpinion = createString("aprvOpinion");

    public final NumberPath<Integer> aprvOrder = createNumber("aprvOrder", Integer.class);

    public final StringPath aprvResult = createString("aprvResult");

    public final DateTimePath<java.time.LocalDateTime> aprvTime = createDateTime("aprvTime", java.time.LocalDateTime.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDate = _super.createDate;

    //inherited
    public final NumberPath<Long> createNo = _super.createNo;

    public final NumberPath<Long> docNo = createNumber("docNo", Long.class);

    public final QDocumentApproval document;

    public final QMemberInfo memberInfo;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateDate = _super.updateDate;

    //inherited
    public final NumberPath<Long> updateNo = _super.updateNo;

    public QApproval(String variable) {
        this(Approval.class, forVariable(variable), INITS);
    }

    public QApproval(Path<? extends Approval> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QApproval(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QApproval(PathMetadata metadata, PathInits inits) {
        this(Approval.class, metadata, inits);
    }

    public QApproval(Class<? extends Approval> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.document = inits.isInitialized("document") ? new QDocumentApproval(forProperty("document"), inits.get("document")) : null;
        this.memberInfo = inits.isInitialized("memberInfo") ? new QMemberInfo(forProperty("memberInfo"), inits.get("memberInfo")) : null;
    }

}

