.class public final Lcom/tencent/mm/d/a/em;
.super Lcom/tencent/mm/sdk/c/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/mm/d/a/em$b;,
        Lcom/tencent/mm/d/a/em$a;
    }
.end annotation


# static fields
.field public static atN:Z

.field public static atO:Z


# instance fields
.field public aAU:Lcom/tencent/mm/d/a/em$a;

.field public aAV:Lcom/tencent/mm/d/a/em$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 6
    sput-boolean v0, Lcom/tencent/mm/d/a/em;->atN:Z

    .line 7
    sput-boolean v0, Lcom/tencent/mm/d/a/em;->atO:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 12
    invoke-direct {p0}, Lcom/tencent/mm/sdk/c/d;-><init>()V

    .line 17
    new-instance v0, Lcom/tencent/mm/d/a/em$a;

    invoke-direct {v0}, Lcom/tencent/mm/d/a/em$a;-><init>()V

    iput-object v0, p0, Lcom/tencent/mm/d/a/em;->aAU:Lcom/tencent/mm/d/a/em$a;

    .line 28
    new-instance v0, Lcom/tencent/mm/d/a/em$b;

    invoke-direct {v0}, Lcom/tencent/mm/d/a/em$b;-><init>()V

    iput-object v0, p0, Lcom/tencent/mm/d/a/em;->aAV:Lcom/tencent/mm/d/a/em$b;

    .line 12
    const-string/jumbo v0, "NetSceneLbsFind"

    iput-object v0, p0, Lcom/tencent/mm/d/a/em;->id:Ljava/lang/String;

    sget-boolean v0, Lcom/tencent/mm/d/a/em;->atO:Z

    iput-boolean v0, p0, Lcom/tencent/mm/d/a/em;->hXT:Z

    return-void
.end method