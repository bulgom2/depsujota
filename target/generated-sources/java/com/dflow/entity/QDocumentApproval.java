package com.dflow.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDocumentApproval is a Querydsl query type for DocumentApproval
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDocumentApproval extends EntityPathBase<DocumentApproval> {

    private static final long serialVersionUID = -1643987648L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDocumentApproval documentApproval = new QDocumentApproval("documentApproval");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final ListPath<Approval, QApproval> approvalList = this.<Approval, QApproval>createList("approvalList", Approval.class, QApproval.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDate = _super.createDate;

    //inherited
    public final NumberPath<Long> createNo = _super.createNo;

    public final StringPath docCn = createString("docCn");

    public final StringPath docFlag = createString("docFlag");

    public final NumberPath<Long> docFormNo = createNumber("docFormNo", Long.class);

    public final NumberPath<Long> docNo = createNumber("docNo", Long.class);

    public final StringPath docRecovery = createString("docRecovery");

    public final StringPath docState = createString("docState");

    public final StringPath docTTL = createString("docTTL");

    public final QDocumentType documentTypeInfo;

    public final NumberPath<Long> fileAttachNo = createNumber("fileAttachNo", Long.class);

    public final QMemberInfo memberInfo;

    public final ListPath<Reference, QReference> referenceList = this.<Reference, QReference>createList("referenceList", Reference.class, QReference.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateDate = _super.updateDate;

    //inherited
    public final NumberPath<Long> updateNo = _super.updateNo;

    public QDocumentApproval(String variable) {
        this(DocumentApproval.class, forVariable(variable), INITS);
    }

    public QDocumentApproval(Path<? extends DocumentApproval> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDocumentApproval(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDocumentApproval(PathMetadata metadata, PathInits inits) {
        this(DocumentApproval.class, metadata, inits);
    }

    public QDocumentApproval(Class<? extends DocumentApproval> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.documentTypeInfo = inits.isInitialized("documentTypeInfo") ? new QDocumentType(forProperty("documentTypeInfo"), inits.get("documentTypeInfo")) : null;
        this.memberInfo = inits.isInitialized("memberInfo") ? new QMemberInfo(forProperty("memberInfo"), inits.get("memberInfo")) : null;
    }

}

