package com.dflow.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdminRequest is a Querydsl query type for AdminRequest
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdminRequest extends EntityPathBase<AdminRequest> {

    private static final long serialVersionUID = -2126701054L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdminRequest adminRequest = new QAdminRequest("adminRequest");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDate = _super.createDate;

    //inherited
    public final NumberPath<Long> createNo = _super.createNo;

    public final StringPath requestContent = createString("requestContent");

    public final StringPath requestFlag = createString("requestFlag");

    public final NumberPath<Long> requestNo = createNumber("requestNo", Long.class);

    public final StringPath requestType = createString("requestType");

    public final QRollbook rollbook;

    public final NumberPath<Long> rollbookNo = createNumber("rollbookNo", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateDate = _super.updateDate;

    //inherited
    public final NumberPath<Long> updateNo = _super.updateNo;

    public QAdminRequest(String variable) {
        this(AdminRequest.class, forVariable(variable), INITS);
    }

    public QAdminRequest(Path<? extends AdminRequest> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdminRequest(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdminRequest(PathMetadata metadata, PathInits inits) {
        this(AdminRequest.class, metadata, inits);
    }

    public QAdminRequest(Class<? extends AdminRequest> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.rollbook = inits.isInitialized("rollbook") ? new QRollbook(forProperty("rollbook"), inits.get("rollbook")) : null;
    }

}

