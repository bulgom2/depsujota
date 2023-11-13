package com.dflow.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAnnualLeave is a Querydsl query type for AnnualLeave
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAnnualLeave extends EntityPathBase<AnnualLeave> {

    private static final long serialVersionUID = -671489514L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAnnualLeave annualLeave = new QAnnualLeave("annualLeave");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final NumberPath<Double> annualCount = createNumber("annualCount", Double.class);

    public final DatePath<java.time.LocalDate> annualEndDate = createDate("annualEndDate", java.time.LocalDate.class);

    public final NumberPath<Double> annualLeft = createNumber("annualLeft", Double.class);

    public final NumberPath<Long> annualNo = createNumber("annualNo", Long.class);

    public final StringPath annualType = createString("annualType");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDate = _super.createDate;

    //inherited
    public final NumberPath<Long> createNo = _super.createNo;

    public final QMemberInfo member;

    public final NumberPath<Long> memberNo = createNumber("memberNo", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateDate = _super.updateDate;

    //inherited
    public final NumberPath<Long> updateNo = _super.updateNo;

    public QAnnualLeave(String variable) {
        this(AnnualLeave.class, forVariable(variable), INITS);
    }

    public QAnnualLeave(Path<? extends AnnualLeave> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAnnualLeave(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAnnualLeave(PathMetadata metadata, PathInits inits) {
        this(AnnualLeave.class, metadata, inits);
    }

    public QAnnualLeave(Class<? extends AnnualLeave> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMemberInfo(forProperty("member"), inits.get("member")) : null;
    }

}

