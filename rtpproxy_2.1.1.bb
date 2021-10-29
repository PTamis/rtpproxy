SUMMARY = "A high-performance software proxy that brings control to your VoIP network"
DESCRIPTION = "The RTPProxy is a high-performance software proxy for RTP \
               streams that can work together with Sippy B2BUA, Kamailio, \
               OpenSIPs and SER (SIP Express Router)"
HOMEPAGE = "https://www.rtpproxy.org/"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ee6c7139da927630b2b1bbfd7328279e"

SRC_URI = "git://github.com/sippy/rtpproxy.git;protocol=https;branch=rtpp_2_1 \
           file://autotools-fixes.patch"
SRCREV = "146c491e4daa0a799783ef8d08809def79145f97"

S = "${WORKDIR}/git"

DEPENDS = "libsndfile1"

inherit autotools
