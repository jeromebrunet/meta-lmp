LINUX_VERSION ?= "4.14.18"

SRCREV = "4fbe7edd18110d665b20b319b49eb51f168a9677"
OSF_LMP_GIT_URL ?= "source.foundries.io"
OSF_LMP_GIT_NAMESPACE ?= ""

SRC_URI = "git://${OSF_LMP_GIT_URL}/${OSF_LMP_GIT_NAMESPACE}linux.git;protocol=https;branch=linux-v4.14.y;name=kernel \
           file://distro.scc \
"

require linux-osf.inc
require linux-osf-machine-custom.inc
