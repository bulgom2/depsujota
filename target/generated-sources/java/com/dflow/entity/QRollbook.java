package com.dflow.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRollbook is a Querydsl query type for Rollbook
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRollbook extends EntityPathBase<Rollbook> {

    private static final long serialVersionUID = -1507425368L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRollbook rollbook = new QRollbook("rollbook");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final ListPath<AdminRequest, QAdminRequest> corrections = this.<AdminRequest, QAdminRequest>createList("corrections", AdminRequest.class, QAdminRequest.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDate = _super.createDate;

    //inherited
    public final NumberPath<Long> createNo = _super.createNo;

    public final QMemberInfo member;

    public final StringPath rollbookCloseState = createString("rollbookCloseState");

    public final DateTimePath<java.time.LocalDateTime> rollbookCloseTime = createDateTime("rollbookCloseTime", java.time.LocalDateTime.class);

    public final StringPath rollbookContents = createString("rollbookContents");

    public final StringPath rollbookFlag = createString("rollbookFlag");

    public final NumberPath<Long> rollbookNo = createNumber("rollbookNo", Long.class);

    public final StringPath rollbookOpenState = createString("rollbookOpenState");

    public final DateTimePath<java.time.LocalDateTime> rollbookOpenTime = createDateTime("rollbookOpenTime", java.time.LocalDateTime.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateDate = _super.updateDate;

    //inherited
    public final NumberPath<Long> updateNo = _super.updateNo;

    public QRollbook(String variable) {
        this(Rollbook.class, forVariable(variable), INITS);
    }

    public QRollbook(Path<? extends Rollbook> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRollbook(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRollbook(PathMetadata metadata, PathInits inits) {
        this(Rollbook.class, metadata, inits);
    }

    public QRollbook(Class<? extends Rollbook> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMemberInfo(forProperty("member"), inits.get("member")) : null;
    }

}

