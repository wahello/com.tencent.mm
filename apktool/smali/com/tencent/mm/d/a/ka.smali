.class public final Lcom/tencent/mm/d/a/ka;
.super Lcom/tencent/mm/sdk/c/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/mm/d/a/ka$a;
    }
.end annotation


# static fields
.field public static atN:Z

.field public static atO:Z


# instance fields
.field public aHm:Lcom/tencent/mm/d/a/ka$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 6
    sput-boolean v0, Lcom/tencent/mm/d/a/ka;->atN:Z

    .line 7
    sput-boolean v0, Lcom/tencent/mm/d/a/ka;->atO:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0}, Lcom/tencent/mm/sdk/c/d;-><init>()V

    .line 21
    new-instance v0, Lcom/tencent/mm/d/a/ka$a;

    invoke-direct {v0}, Lcom/tencent/mm/d/a/ka$a;-><init>()V

    iput-object v0, p0, Lcom/tencent/mm/d/a/ka;->aHm:Lcom/tencent/mm/d/a/ka$a;

    .line 16
    const-string/jumbo v0, "WearVoipController"

    iput-object v0, p0, Lcom/tencent/mm/d/a/ka;->id:Ljava/lang/String;

    sget-boolean v0, Lcom/tencent/mm/d/a/ka;->atO:Z

    iput-boolean v0, p0, Lcom/tencent/mm/d/a/ka;->hXT:Z

    return-void
.end method