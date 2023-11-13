package com.dflow.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberInfo is a Querydsl query type for MemberInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberInfo extends EntityPathBase<MemberInfo> {

    private static final long serialVersionUID = -2104283990L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberInfo memberInfo = new QMemberInfo("memberInfo");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDate = _super.createDate;

    public final QDepartment department;

    public final NumberPath<Long> departmentNo = createNumber("departmentNo", Long.class);

    public final QAttachFile imgAttach;

    public final NumberPath<Long> imgAttachNo = createNumber("imgAttachNo", Long.class);

    public final StringPath memberAddress = createString("memberAddress");

    public final DatePath<java.time.LocalDate> memberBirthdate = createDate("memberBirthdate", java.time.LocalDate.class);

    public final StringPath memberEmail = createString("memberEmail");

    public final DatePath<java.time.LocalDate> memberEnableDate = createDate("memberEnableDate", java.time.LocalDate.class);

    public final StringPath memberFlag = createString("memberFlag");

    public final StringPath memberGender = createString("memberGender");

    public final StringPath memberId = createString("memberId");

    public final DatePath<java.time.LocalDate> memberLeaveDate = createDate("memberLeaveDate", java.time.LocalDate.class);

    public final StringPath memberNameCn = createString("memberNameCn");

    public final StringPath memberNameEn = createString("memberNameEn");

    public final StringPath memberNameKr = createString("memberNameKr");

    public final NumberPath<Long> memberNo = createNumber("memberNo", Long.class);

    public final StringPath memberPhone = createString("memberPhone");

    public final StringPath memberPw = createString("memberPw");

    public final StringPath memberRole = createString("memberRole");

    public final QAttachFile signAttach;

    public final NumberPath<Long> signAttachNo = createNumber("signAttachNo", Long.class);

    public final QStaff staff;

    public final NumberPath<Long> staffNo = createNumber("staffNo", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateDate = _super.updateDate;

    public final QMemberInfo updateInfo;

    public final NumberPath<Long> updateNo = createNumber("updateNo", Long.class);

    public QMemberInfo(String variable) {
        this(MemberInfo.class, forVariable(variable), INITS);
    }

    public QMemberInfo(Path<? extends MemberInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberInfo(PathMetadata metadata, PathInits inits) {
        this(MemberInfo.class, metadata, inits);
    }

    public QMemberInfo(Class<? extends MemberInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.department = inits.isInitialized("department") ? new QDepartment(forProperty("department"), inits.get("department")) : null;
        this.imgAttach = inits.isInitialized("imgAttach") ? new QAttachFile(forProperty("imgAttach")) : null;
        this.signAttach = inits.isInitialized("signAttach") ? new QAttachFile(forProperty("signAttach")) : null;
        this.staff = inits.isInitialized("staff") ? new QStaff(forProperty("staff")) : null;
        this.updateInfo = inits.isInitialized("updateInfo") ? new QMemberInfo(forProperty("updateInfo"), inits.get("updateInfo")) : null;
    }

}

