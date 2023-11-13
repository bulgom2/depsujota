package com.dflow.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDocumentTypeFolder is a Querydsl query type for DocumentTypeFolder
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDocumentTypeFolder extends EntityPathBase<DocumentTypeFolder> {

    private static final long serialVersionUID = -1977724923L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDocumentTypeFolder documentTypeFolder = new QDocumentTypeFolder("documentTypeFolder");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final ListPath<DocumentTypeFolder, QDocumentTypeFolder> childrenFolder = this.<DocumentTypeFolder, QDocumentTypeFolder>createList("childrenFolder", DocumentTypeFolder.class, QDocumentTypeFolder.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDate = _super.createDate;

    //inherited
    public final NumberPath<Long> createNo = _super.createNo;

    public final NumberPath<Integer> depth = createNumber("depth", Integer.class);

    public final NumberPath<Integer> orderValue = createNumber("orderValue", Integer.class);

    public final QDocumentTypeFolder parentFolder;

    public final NumberPath<Long> parentFolderNo = createNumber("parentFolderNo", Long.class);

    public final StringPath typeFolderFlag = createString("typeFolderFlag");

    public final StringPath typeFolderName = createString("typeFolderName");

    public final NumberPath<Long> typeFolderNo = createNumber("typeFolderNo", Long.class);

    public final ListPath<DocumentType, QDocumentType> typeList = this.<DocumentType, QDocumentType>createList("typeList", DocumentType.class, QDocumentType.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateDate = _super.updateDate;

    //inherited
    public final NumberPath<Long> updateNo = _super.updateNo;

    public QDocumentTypeFolder(String variable) {
        this(DocumentTypeFolder.class, forVariable(variable), INITS);
    }

    public QDocumentTypeFolder(Path<? extends DocumentTypeFolder> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDocumentTypeFolder(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDocumentTypeFolder(PathMetadata metadata, PathInits inits) {
        this(DocumentTypeFolder.class, metadata, inits);
    }

    public QDocumentTypeFolder(Class<? extends DocumentTypeFolder> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.parentFolder = inits.isInitialized("parentFolder") ? new QDocumentTypeFolder(forProperty("parentFolder"), inits.get("parentFolder")) : null;
    }

}

