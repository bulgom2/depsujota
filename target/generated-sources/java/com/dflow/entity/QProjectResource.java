package com.dflow.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProjectResource is a Querydsl query type for ProjectResource
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProjectResource extends EntityPathBase<ProjectResource> {

    private static final long serialVersionUID = 198786373L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProjectResource projectResource = new QProjectResource("projectResource");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDate = _super.createDate;

    //inherited
    public final NumberPath<Long> createNo = _super.createNo;

    public final QMemberInfo member;

    public final QProjectInfo project;

    public final NumberPath<Long> resourceDuration = createNumber("resourceDuration", Long.class);

    public final DatePath<java.time.LocalDate> resourceEndDate = createDate("resourceEndDate", java.time.LocalDate.class);

    public final NumberPath<Double> resourceHours = createNumber("resourceHours", Double.class);

    public final NumberPath<Long> resourceNo = createNumber("resourceNo", Long.class);

    public final NumberPath<Integer> resourceProgress = createNumber("resourceProgress", Integer.class);

    public final DatePath<java.time.LocalDate> resourceStartDate = createDate("resourceStartDate", java.time.LocalDate.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateDate = _super.updateDate;

    //inherited
    public final NumberPath<Long> updateNo = _super.updateNo;

    public QProjectResource(String variable) {
        this(ProjectResource.class, forVariable(variable), INITS);
    }

    public QProjectResource(Path<? extends ProjectResource> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProjectResource(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProjectResource(PathMetadata metadata, PathInits inits) {
        this(ProjectResource.class, metadata, inits);
    }

    public QProjectResource(Class<? extends ProjectResource> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMemberInfo(forProperty("member"), inits.get("member")) : null;
        this.project = inits.isInitialized("project") ? new QProjectInfo(forProperty("project")) : null;
    }

}

