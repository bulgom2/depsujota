package com.dflow.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDepartment is a Querydsl query type for Department
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDepartment extends EntityPathBase<Department> {

    private static final long serialVersionUID = 85387668L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDepartment department = new QDepartment("department");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final ListPath<Department, QDepartment> children = this.<Department, QDepartment>createList("children", Department.class, QDepartment.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDate = _super.createDate;

    public final QMemberInfo createInfo;

    //inherited
    public final NumberPath<Long> createNo = _super.createNo;

    public final NumberPath<Integer> departmentDepth = createNumber("departmentDepth", Integer.class);

    public final BooleanPath departmentFlag = createBoolean("departmentFlag");

    public final StringPath departmentName = createString("departmentName");

    public final NumberPath<Long> departmentNo = createNumber("departmentNo", Long.class);

    public final QDepartment departmentParentNo;

    public final ListPath<MemberInfo, QMemberInfo> members = this.<MemberInfo, QMemberInfo>createList("members", MemberInfo.class, QMemberInfo.class, PathInits.DIRECT2);

    public final NumberPath<Long> queueValue = createNumber("queueValue", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateDate = _super.updateDate;

    //inherited
    public final NumberPath<Long> updateNo = _super.updateNo;

    public QDepartment(String variable) {
        this(Department.class, forVariable(variable), INITS);
    }

    public QDepartment(Path<? extends Department> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDepartment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDepartment(PathMetadata metadata, PathInits inits) {
        this(Department.class, metadata, inits);
    }

    public QDepartment(Class<? extends Department> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.createInfo = inits.isInitialized("createInfo") ? new QMemberInfo(forProperty("createInfo"), inits.get("createInfo")) : null;
        this.departmentParentNo = inits.isInitialized("departmentParentNo") ? new QDepartment(forProperty("departmentParentNo"), inits.get("departmentParentNo")) : null;
    }

}

