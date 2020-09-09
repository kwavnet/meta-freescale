# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Mainline/LTS rebased NXP/QorIQ patches + FSLC patches."
DESCRIPTION = "Linux kernel based on LTS kernel used by FSL Community BSP in order to \
provide support for some backported features and fixes, or because it was applied in linux-next \
and takes some time to become part of a stable version, or because it is not applicable for \
upstreaming."

require recipes-kernel/linux/linux-qoriq.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

LINUX_VERSION = "5.4.63"

SRCBRANCH = "5.4.y+qoriq+fslc"
SRCREV = "183ad8ea350bd55b9eb3904b9c9b586e1556ed19"
SRC_URI := "git://github.com/Freescale/linux-fslc.git;branch=${SRCBRANCH}"
