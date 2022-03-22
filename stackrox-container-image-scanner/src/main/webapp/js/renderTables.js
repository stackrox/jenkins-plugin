function renderCVETable(tableId, cves) {
    jQuery(document).ready(function () {
      jQuery(tableId).DataTable({
        dom: '<"top"l>rt<"bottom pagination-items"fip><"clear">',
        retrieve: true,
        bFilter: false,
        order: [[2, 'desc']],
        data: cves,
        columns : [
                    { title: 'COMPONENT', data : 'packageName' },
                    { title: 'VERSION', data : 'packageVersion'},
                    { title: 'CVE', mData : function (data, type, dataToSet) {
                                                    return `<a target="_blank" href="${data.link}">${data.id}</a>`;
                                               }
                    },
                    { title: 'SEVERITY', data : 'severity' },
                    { title: 'CVSS SCORE', mData : function (data, type, dataToSet) {
                                                    if (data.cvssScore == 0) {
                                                        return `<span>-</span>`
                                                    }
                                                    return `<span>${data.cvssScore}</span><span style="font-size: 10px; font-family Arial"> (${data.scoreType})</span>`;
                                               }
                    },
                    { title: 'FIXABLE', data : 'fixable' },
                ],
        columnDefs: [
                      {
                        targets: [0, 1, 2, 3, 4],
                        render: function (source, type, val) {
                          return `<span style="word-break: break-word;">${source}</span>`;
                        }
                      },
                    ]
      });
    });
}

function renderPolicyViolationTable(tableId, violatedPolicies) {
    jQuery(document).ready(function () {
      jQuery(tableId).DataTable({
        dom: '<"top"l>rt<"bottom pagination-items"fip><"clear">',
        retrieve: true,
        bFilter: false,
        order: [[0, 'asc']],
        data: violatedPolicies,
        columns : [
                    { title: 'POLICY', data : 'name' },
                    { title: 'SEVERITY', data : 'severity' },
                    { title: 'DESCRIPTION', data : 'description' },
                    { title: 'VIOLATION', data : 'violations' },
                    { title: 'REMEDIATION', data : 'remediation' },
                    { title: 'ENFORCED', data : 'buildEnforced' },

                ],
        columnDefs: [
                  {
                    targets: [0],
                    render: function (source, type, val) {
                      return `<span style="word-break: break-word; min-width: 120px; display: block;">${source}</span>`;
                    }
                  },
                  {
                    targets: [2, 3, 4],
                    render: function (source, type, val) {
                      return `<span style="word-break: break-word;">${source}</span>`;
                    }
                  },
                ]
      });
    });
}

function renderTabs() {
  jQuery(document).ready(function () {
      $('.tab-content:first-child').show();
      $('.tab-nav-link').bind('click', function(e) {
        $this = $(this);
        $tabs = $this.parent().parent().next();
        $target = $($this.data("target")); // get the target from data attribute
        $this.siblings().removeClass('current');
        $target.siblings().css("display", "none")
          $this.addClass('current');
          $target.fadeIn("fast");

      });
      $('.tab-nav-link:first-child').trigger('click');
      });
}
