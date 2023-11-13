package com.dflow.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDocumentType is a Querydsl query type for DocumentType
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDocumentType extends EntityPathBase<DocumentType> {

    private static final long serialVersionUID = -81204041L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDocumentType documentType = new QDocumentType("documentType");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final QAttachFile attachFile;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDate = _super.createDate;

    //inherited
    public final NumberPath<Long> createNo = _super.createNo;

    public final StringPath docFormCode = createString("docFormCode");

    public final StringPath docFormName = createString("docFormName");

    public final NumberPath<Long> docFormTypeNo = createNumber("docFormTypeNo", Long.class);

    public final StringPath docFormUseFlag = createString("docFormUseFlag");

    public final NumberPath<Long> fileAttachNo = createNumber("fileAttachNo", Long.class);

    public final NumberPath<Long> folderNo = createNumber("folderNo", Long.class);

    public final NumberPath<Integer> orderValue = createNumber("orderValue", Integer.class);

    public final QDocumentTypeFolder typeFolder;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateDate = _super.updateDate;

    //inherited
    public final NumberPath<Long> updateNo = _super.updateNo;

    public QDocumentType(String variable) {
        this(DocumentType.class, forVariable(variable), INITS);
    }

    public QDocumentType(Path<? extends DocumentType> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDocumentType(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDocumentType(PathMetadata metadata, PathInits inits) {
        this(DocumentType.class, metadata, inits);
    }

    public QDocumentType(Class<? extends DocumentType> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.attachFile = inits.isInitialized("attachFile") ? new QAttachFile(forProperty("attachFile")) : null;
        this.typeFolder = inits.isInitialized("typeFolder") ? new QDocumentTypeFolder(forProperty("typeFolder"), inits.get("typeFolder")) : null;
    }

}

