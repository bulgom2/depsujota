package com.dflow.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLeaveRecord is a Querydsl query type for LeaveRecord
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLeaveRecord extends EntityPathBase<LeaveRecord> {

    private static final long serialVersionUID = 809149414L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLeaveRecord leaveRecord = new QLeaveRecord("leaveRecord");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDate = _super.createDate;

    //inherited
    public final NumberPath<Long> createNo = _super.createNo;

    public final QDocumentApproval document;

    public final StringPath leaveContents = createString("leaveContents");

    public final DatePath<java.time.LocalDate> leaveEndDate = createDate("leaveEndDate", java.time.LocalDate.class);

    public final NumberPath<Long> leaveNo = createNumber("leaveNo", Long.class);

    public final DatePath<java.time.LocalDate> leaveStartDate = createDate("leaveStartDate", java.time.LocalDate.class);

    public final StringPath leaveType = createString("leaveType");

    public final NumberPath<Double> leaveUseCount = createNumber("leaveUseCount", Double.class);

    public final QMemberInfo member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateDate = _super.updateDate;

    //inherited
    public final NumberPath<Long> updateNo = _super.updateNo;

    public QLeaveRecord(String variable) {
        this(LeaveRecord.class, forVariable(variable), INITS);
    }

    public QLeaveRecord(Path<? extends LeaveRecord> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLeaveRecord(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLeaveRecord(PathMetadata metadata, PathInits inits) {
        this(LeaveRecord.class, metadata, inits);
    }

    public QLeaveRecord(Class<? extends LeaveRecord> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.document = inits.isInitialized("document") ? new QDocumentApproval(forProperty("document"), inits.get("document")) : null;
        this.member = inits.isInitialized("member") ? new QMemberInfo(forProperty("member"), inits.get("member")) : null;
    }

}

