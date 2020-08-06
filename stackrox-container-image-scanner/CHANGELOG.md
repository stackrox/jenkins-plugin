# Changelog
All notable changes to the StackRox Container Image Scanner Jenkins plugin will be documented in this file.

## [1.2.3]
* Upgraded guava version to fix unbounded memory allocation vulnerability in the guava dependency version being used.

## [1.2.2]	
* Fixed HTML reports when CVE publishedOn date is not available.
* Fixed incorrect reporting of CVE Fixable state.

## [1.2.1]
* Fixed CSV reports generation at remote paths.

## [1.2]
* Improved styling for the plugin report.
* Fixed possible NPEs when certain scanners return only a subset of the CVE properties that the plugin reports.
* Improved portalAddress URL validation to accommodate non standard TLDs.


## [1.1]
The StackRox Container Image Scanner enables scanning of container images for published software vulnerabilities. 
Add it as a Pipeline or Freestyle project build step to ensure your infrastructure is in adherence with StackRox Kubernetes
Security Platform vulnerability management policies.
