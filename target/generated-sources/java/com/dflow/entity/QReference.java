package com.dflow.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReference is a Querydsl query type for Reference
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReference extends EntityPathBase<Reference> {

    private static final long serialVersionUID = -949761847L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReference reference = new QReference("reference");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDate = _super.createDate;

    //inherited
    public final NumberPath<Long> createNo = _super.createNo;

    public final StringPath docCheck = createString("docCheck");

    public final NumberPath<Long> docNo = createNumber("docNo", Long.class);

    public final QDocumentApproval document;

    public final QMemberInfo member;

    public final NumberPath<Long> refMemberNo = createNumber("refMemberNo", Long.class);

    public final NumberPath<Long> refNo = createNumber("refNo", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateDate = _super.updateDate;

    //inherited
    public final NumberPath<Long> updateNo = _super.updateNo;

    public QReference(String variable) {
        this(Reference.class, forVariable(variable), INITS);
    }

    public QReference(Path<? extends Reference> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReference(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReference(PathMetadata metadata, PathInits inits) {
        this(Reference.class, metadata, inits);
    }

    public QReference(Class<? extends Reference> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.document = inits.isInitialized("document") ? new QDocumentApproval(forProperty("document"), inits.get("document")) : null;
        this.member = inits.isInitialized("member") ? new QMemberInfo(forProperty("member"), inits.get("member")) : null;
    }

}

