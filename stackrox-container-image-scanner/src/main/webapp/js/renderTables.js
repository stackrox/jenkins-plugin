function renderCVETable(tableId, cves) {
    jQuery(document).ready(function () {
      jQuery(tableId).DataTable({
        dom: '<"top"l>rt<"bottom pagination-items"fip><"clear">',
        retrieve: true,
        bFilter: false,
        order: [[2, 'desc']],
        data: cves,
        columns : [
                    { title: 'CVE ID', mData : function (data, type, dataToSet) {
                                                    return `<a target="_blank" href="${data.link}">${data.id}</a>`;
                                               }
                    },
                    { title: 'CVSS Score', mData : function (data, type, dataToSet) {
                                                    if (data.cvssScore == 0) {
                                                        return `<span>-</span>`
                                                    }
                                                    return `<span>${data.cvssScore}</span><span style="font-size: 10px; font-family Arial"> (${data.scoreType})</span>`;
                                               }
                    },
                    { title: 'Package Name', data : 'packageName' },
                    { title: 'Package Version', data : 'packageVersion' },
                    { title: 'Fixable', data : 'fixable' },
                    { title: 'Publish Date', mData : function (data, type, dataToSet) {
                                                 if (data.publishDate == "-") {
                                                    return `<span>-</span>`
                                                 } else {
                                                    var d = new Date(data.publishDate);
                                                    return `<span>${d.getMonth()+1}/${d.getDate()}/${d.getFullYear()}</span>`
                                                 }
                                               }
                   },
                ],
        columnDefs: [
                      {
                        targets: [0, 2, 3, 5],
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
                    { title: 'Policy', data : 'name' },
                    { title: 'Description', data : 'description' },
                    { title: 'Severity', data : 'severity' },
                    { title: 'Remediation', data : 'remediation' },

                ],
        columnDefs: [
                  {
                    targets: [0],
                    render: function (source, type, val) {
                      return `<span style="word-break: break-word; min-width: 120px; display: block;">${source}</span>`;
                    }
                  },
                  {
                    targets: [1, 3],
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