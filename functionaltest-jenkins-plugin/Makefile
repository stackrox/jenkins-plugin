.PHONY: all
all: style test
##########
## Test ##
##########
.PHONY: test
test:
	@echo "+ $@"
	@./gradlew :cleanTest :test
###########
## Style ##
###########
.PHONY: style
style:
	@echo "+ $@"
	@./gradlew --continue codenarcMain codenarcTest ; \
    STATUS=$$? ; \
    if [ $$STATUS -ne 0 ]; then \
        cat build/reports/codenarc/main.txt build/reports/codenarc/test.txt >&2 2>/dev/null ; \
    fi ; \
    exit $$STATUS



