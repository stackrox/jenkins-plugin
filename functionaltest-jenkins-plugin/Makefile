.PHONY: all
all: style test
###########
## Style ##
###########
.PHONY: style
style:
	@echo "+ $@"
	gradle --continue codenarcMain codenarcTest ; \
    STATUS=$$? ; \
    if [ $$STATUS -ne 0 ]; then \
        cat build/reports/codenarc/main.txt build/reports/codenarc/test.txt >&2 2>/dev/null ; \
    fi ; \
    exit $$STATUS

.PHONY: src
test: 
	@echo "+ $@" \
	gradle :cleanTest :test \

