package com.dflow.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReferenceFile is a Querydsl query type for ReferenceFile
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReferenceFile extends EntityPathBase<ReferenceFile> {

    private static final long serialVersionUID = 1802610149L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReferenceFile referenceFile = new QReferenceFile("referenceFile");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final QAttachFile attachFile;

    public final NumberPath<Long> attachFileNo = createNumber("attachFileNo", Long.class);

    public final NumberPath<Long> boardNo = createNumber("boardNo", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDate = _super.createDate;

    public final NumberPath<Long> createNo = createNumber("createNo", Long.class);

    public final NumberPath<Long> docAprvNo = createNumber("docAprvNo", Long.class);

    public final BooleanPath fileFlag = createBoolean("fileFlag");

    public final NumberPath<Long> referenceFileNO = createNumber("referenceFileNO", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateDate = _super.updateDate;

    public QReferenceFile(String variable) {
        this(ReferenceFile.class, forVariable(variable), INITS);
    }

    public QReferenceFile(Path<? extends ReferenceFile> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReferenceFile(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReferenceFile(PathMetadata metadata, PathInits inits) {
        this(ReferenceFile.class, metadata, inits);
    }

    public QReferenceFile(Class<? extends ReferenceFile> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.attachFile = inits.isInitialized("attachFile") ? new QAttachFile(forProperty("attachFile")) : null;
    }

}

