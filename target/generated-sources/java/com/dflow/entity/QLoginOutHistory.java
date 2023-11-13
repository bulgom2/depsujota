package com.dflow.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QLoginOutHistory is a Querydsl query type for LoginOutHistory
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLoginOutHistory extends EntityPathBase<LoginOutHistory> {

    private static final long serialVersionUID = -90904403L;

    public static final QLoginOutHistory loginOutHistory = new QLoginOutHistory("loginOutHistory");

    public final StringPath activityType = createString("activityType");

    public final StringPath clientIp = createString("clientIp");

    public final NumberPath<Long> logNo = createNumber("logNo", Long.class);

    public final StringPath memberId = createString("memberId");

    public final DateTimePath<java.time.LocalDateTime> timestamp = createDateTime("timestamp", java.time.LocalDateTime.class);

    public final StringPath userAgent = createString("userAgent");

    public QLoginOutHistory(String variable) {
        super(LoginOutHistory.class, forVariable(variable));
    }

    public QLoginOutHistory(Path<? extends LoginOutHistory> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLoginOutHistory(PathMetadata metadata) {
        super(LoginOutHistory.class, metadata);
    }

}

